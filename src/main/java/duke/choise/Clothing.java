package duke.choise;

import java.util.Objects;

public class Clothing {
    // Constants
    public static final double MINIMUM_PRICE = 10.0;
    public static final double TAX_RATE = 0.2;

    // Attributes
    private String description;
    private String size;
    private double price;

    // Constructors
    public Clothing(String description, String size, double price) {
        this.description = description;
        this.size = size;
        setPrice(price); // Using the setter method to ensure the minimum price is enforced
    }

    // Getter methods
    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    // Getter method to calculate the total price with tax
    public double getTotalPriceWithTax() {
        return getPrice() * (1 + TAX_RATE);
    }

    // Setter methods
    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        // Ensure the price is never smaller than the minimum value
        this.price = Math.max(price, MINIMUM_PRICE);
    }

    // Display information about the clothing
    public void displayInfo() {
        System.out.println("Clothing Information:");
        System.out.println("Description: " + description);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + getPrice());
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return Double.compare(clothing.price, price) == 0 &&
                description.equals(clothing.description) &&
                size.equals(clothing.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, size, price);
    }
}
