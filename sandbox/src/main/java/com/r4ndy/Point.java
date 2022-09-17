package com.r4ndy;

public class Point {
	
	//Fields
	private int x,y;
	
	//Methods
	public double distanceTo(Point p2) {
		return Math.sqrt( ((x - p2.getX()) * (x - p2.getX())) + ((y - p2.getY()) * (y - p2.getY())) );
	}
	
	//Constructors
	public Point() {
		x = y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getters & Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
