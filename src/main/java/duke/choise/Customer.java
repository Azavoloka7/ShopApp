package duke.choise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String size;
    private List<String> purchases;
    private List<Clothing> items; // New private instance variable

    // Constructors
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.size = ""; // Initialize size
        this.purchases = new ArrayList<>();
        this.items = new ArrayList<>(); // Initialize items
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter methods for size
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Method to set size based on measurement
    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                size = "S";
                break;
            case 4:
            case 5:
            case 6:
                size = "M";
                break;
            case 7:
            case 8:
            case 9:
                size = "L";
                break;
            default:
                size = "X";
        }
    }

    // New method to add items
    public void addItems(List<Clothing> newItems) {
        items.addAll(newItems);
    }

    // New method to get the array of clothing items
    public List<Clothing> getItems() {
        return items;
    }

    // New method to calculate and return the total cost
    public double getTotalClothingCost() {
        double totalCost = 0.0;
        for (Clothing item : items) {
            totalCost += item.getTotalPriceWithTax(); // Using getTotalPriceWithTax to include tax
        }
        return totalCost;
    }

    // Method to add a purchase
    public void addPurchase(String purchase) {
        purchases.add(purchase);
    }

    // Method to get the list of purchases
    public List<String> getPurchases() {
        return purchases;
    }

    // Override toString for a meaningful representation
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", size='" + size + '\'' +
                ", purchases=" + purchases +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName) &&
                email.equals(customer.email) &&
                size.equals(customer.size) &&
                purchases.equals(customer.purchases) &&
                items.equals(customer.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, size, purchases, items);
    }
}
