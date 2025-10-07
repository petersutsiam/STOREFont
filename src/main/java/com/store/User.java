package com.store;

import java.util.*;
import com.store.Payment;
import com.store.Order;
import com.store.AnalyticsReport;
import com.store.Store;
import com.store.ShoppingCart;

public class User {

	Store store;
	ShoppingCart shoppingCart;
	Collection<Payment> payment;
	Collection<Order> order;
	Collection<AnalyticsReport> analyticsReport;
	public String name;
	public String address;
	public int phone;
	public int postalCode;
	public String country;
	public String city;
	public String email;

	public void login() {
		// TODO - implement User.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement User.logout
		throw new UnsupportedOperationException();
	}

}
