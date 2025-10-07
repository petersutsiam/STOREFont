
package com.store;
import java.util.*;

public class Product {

	Franchise franchise;
	Store store;
	Category category;
	OrderItems orderItems;
	ShoppingCart shoppingCart;
	Collection<Stock> stock;
	Collection<ProductPromotion> productPromotion;
	public String name;
	public String description;
	private int price;
	public Integer image;
	private int stockQuantity = 0;
	private boolean isFranchiseScope;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.stockQuantity = 0;
	}

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stockQuantity;
	}

	public void addStock(int qty) {
		this.stockQuantity += qty;
	}

	public void reduceStock(int qty) {
		this.stockQuantity -= qty;
	}

	public void applyDiscount(int percent) {
		this.price = this.price * (100 - percent) / 100;
	}

}
