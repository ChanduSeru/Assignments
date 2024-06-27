package shopping;

import java.util.ArrayList;
import java.util.List;

class Warehouse {
    private List<Item> items;

    public Warehouse() {
        items = new ArrayList<>();
        // Initialize warehouse items (dummy data for demonstration)
        items.add(new Item(1, 19.99, "Example description 1", "Item 1", 10));
        items.add(new Item(2, 29.99, "Example description 2", "Item 2", 5));
        items.add(new Item(3, 9.99, "Example description 3", "Item 3", 20));
    }

    public void displayWarehouse() {
        System.out.println("Items in Warehouse:");
        for (Item item : items) {
            System.out.println("- " + item.getTitle() + ": " + item.getQuantityInWarehouse() + " available");
        }
    }

    public Item getItemById(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null; // Item not found
    }
}