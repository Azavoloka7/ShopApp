package duke.choise;

import java.util.List;

public class ShopApp {
    public static void main(String[] args) {
        Clothing clothing1 = new Clothing("Blue Jacket", "M", 20.9);
        Clothing clothing2 = new Clothing("Orange T-shirt", "S", 10.5);
        Clothing clothing3 = new Clothing("Blue Jacket", "M", 20.9);
        Clothing clothing4 = new Clothing("Scarf", "S", 13.5);

        Clothing clothing5 = new Clothing("Green Scarf", "S", 5.0);
        Clothing clothing6 = new Clothing("Blue T-Shirt", "S", 10.5);

        Clothing[] clothingArray = {clothing1, clothing2, clothing3, clothing4, clothing5, clothing6};

        String[] items = {"Shirt", "Trousers", "Scarf", "Jacket"};

        Customer customer1 = new Customer("Anatolii", "Zavoloka", "zavoloka@outlook.com");
        Customer customer2 = new Customer("Roman", "Butov", "butov@gmail.com");
        customer1.setSize("X");
        customer2.setSize("S");
        int measurement = 2;
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                customer1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                customer1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                customer1.setSize("L");
                break;
            default:
                customer1.setSize("X");
        }

        // Create a list of clothing items
        List<Clothing> clothingList = List.of(clothingArray);

        // Add items to the customer using addItems method
        customer1.addItems(clothingList);

        // Display information about each clothing item
        for (Clothing item : clothingList) {
            item.displayInfo();
        }

        // Print the total value using the getTotalClothingCost method
        System.out.println("Total Value: $" + customer1.getTotalClothingCost());
    }
}
