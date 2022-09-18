package com.r4ndy;


public class SandboxProject {
	public static void main (String[] args){
		Point dot1 = new Point(0,0);
		Point dot2 = new Point(2,2);
		
		System.out.println("distance: " + distance(dot1, dot2));
		System.out.println("----------");
		System.out.println("Trying inner method distanceTo: " + dot1.distanceTo(dot2));
				
	}
	
	
	public static double distance(Point p1, Point p2) {
		double distance = 0;
		distance = Math.sqrt( ((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())) + ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY())) );
		return distance;
	}

}