package shopping;

import java.util.*;

//Class representing an item in the warehouse
public class Item {
 private int itemId;
 private double price;
 private String description;
 private String title;
 private int quantityInWarehouse;

 public Item(int itemId, double price, String description, String title, int quantityInWarehouse) {
     this.itemId = itemId;
     this.price = price;
     this.description = description;
     this.title = title;
     this.quantityInWarehouse = quantityInWarehouse;
 }

 public int getItemId() {
     return itemId;
 }

 public double getPrice() {
     return price;
 }

 public String getDescription() {
     return description;
 }

 public String getTitle() {
     return title;
 }

 public int getQuantityInWarehouse() {
     return quantityInWarehouse;
 }

 public void setQuantityInWarehouse(int quantityInWarehouse) {
     this.quantityInWarehouse = quantityInWarehouse;
 }
}
