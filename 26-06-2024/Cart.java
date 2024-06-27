package shopping;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Integer, Integer> items; // Map of itemId to quantity

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(Item item, int quantity) {
        int currentQuantity = items.getOrDefault(item.getItemId(), 0);
        items.put(item.getItemId(), currentQuantity + quantity);
        System.out.println(quantity + " " + item.getTitle() + "(s) added to cart.");
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (Map.Entry<Integer, Integer> entry : items.entrySet()) {
                int itemId = entry.getKey();
                int quantity = entry.getValue();
                System.out.println("- " + quantity + " x " + getItemTitle(itemId));
            }
        }
    }

    private String getItemTitle(int itemId) {
        return "Item " + itemId;
    }
}
