package shopping;

import java.util.Scanner;

public class CartManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();
        Cart cart = new Cart();

        int choice;
        do {
        	System.out.println("*********************************");
            System.out.println("Warehouse Management System Menu:");
            System.out.println("1. Display Warehouse Items");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    warehouse.displayWarehouse();
                    break;
                case 2:
                    System.out.print("Enter Item ID to add to cart: ");
                    int itemId = scanner.nextInt();
                    Item itemToAdd = warehouse.getItemById(itemId);
                    if (itemToAdd != null) {
                        System.out.print("Enter quantity to add: ");
                        int quantityToAdd = scanner.nextInt();
                        if (quantityToAdd <= itemToAdd.getQuantityInWarehouse()) {
                            cart.addItem(itemToAdd, quantityToAdd);
                        } else {
                            System.out.println("Insufficient quantity in warehouse.");
                        }
                    } else {
                        System.out.println("Item not found in warehouse.");
                    }
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}