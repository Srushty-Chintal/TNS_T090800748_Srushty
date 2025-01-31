package com.tns.FoodDeliverySystem.entities;
import java.util.HashMap;
import java.util.Map;


public class Cart {
	
	    private Map<FoodItem, Integer> items;

	    public Cart() {
	        this.items = new HashMap<>();
	    }

	    public void addItem(FoodItem foodItem, int quantity) {
	        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
	    }

	    public void showCartDetails() {
	        System.out.println("Cart Details:");
	        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
	            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue());
	        }
	    }

	    public void clearCart() {
	        items.clear();
	    }

	    public Map<FoodItem, Integer> getItems() {
	        return items;
	    }
	}



