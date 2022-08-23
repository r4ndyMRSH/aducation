package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	
	//Variables
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private Product product;
	private int quantity;
	private static double taxRate;
	private static Rushable rushable;

	static {
		taxRate = 0.05;
	}

	//constructors
	public Order(MyDate orderDate, double orderAmount, String customer) {
		this(orderDate, orderAmount, customer, null, 1);

	}

	public Order(MyDate orderDate, double orderAmount, String customer, Product product, int quantity) {
		setOrderDate(orderDate);
		this.orderAmount = orderAmount;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}

	//Class methods
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	
	public char jobSize() {
		if (quantity <= 25) {
			return 'S';
		} else if (quantity <= 75) {
			return 'M';
		} else if (quantity <= 150) {
			return 'L';
		}
		return 'X';
	}

	public double computeTotal() {
		double total = orderAmount;
		switch (jobSize()) {
		case 'M':
			total = total - (orderAmount * 0.01);
			break;
		case 'L':
			total = total - (orderAmount * 0.02);
			break;
		case 'X':
			total = total - (orderAmount * 0.03);
			break;
		}
		if (orderAmount <= 1500) {
			total = total + computeTax();
		}
		return total;

	}
	
	public boolean isPriorityOrder() {
		boolean priorityOrder = false;
		if (rushable != null){
			priorityOrder = rushable.isRushable(orderDate, orderAmount);
		}
		return priorityOrder;
	}
	
	public boolean isHoliday (MyDate  proposedDate) {
		boolean result = false;
		for (MyDate holiday : MyDate.getHolidays()) {
			if (holiday.equals(proposedDate)) {
				result = true;
			}
		}
		return result;
	}
	
	//Overrided methods
		@Override
		public String toString() {
			return quantity + " ea. " + product + " for " + customer;
		}
	
	//Getters and Setters
	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if (orderAmount > 0)
		this.orderAmount = orderAmount;
		else System.out.println("Attempting to create a non-valid order value " + orderAmount);
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >0)
		this.quantity = quantity;
		else System.out.println("Attempting to create a non-valid quantity value " + quantity);
	}
	
	public static double getTaxRate() {
		return taxRate;
	}

	public static Rushable getRushable() {
		return rushable;
	}

	public static void setRushable(Rushable rushable) {
		Order.rushable = rushable;
	}
	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		if(isHoliday(orderDate)) {
			System.out.println("Order date, " + orderDate + ", can't be set to a holiday");
		} else {
		this.orderDate = orderDate;
		}
	}

}