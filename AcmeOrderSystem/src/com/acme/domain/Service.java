package com.acme.domain;

public class Service implements Product {
	//Fields
	private String name;
	private int estimatedTaskDuaration;
	private boolean timeAndMaterials;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEstimatedTaskDuaration() {
		return estimatedTaskDuaration;
	}
	public void setEstimatedTaskDuaration(int estimatedTaskDuaration) {
		this.estimatedTaskDuaration = estimatedTaskDuaration;
	}
	public boolean isTimeAndMaterials() {
		return timeAndMaterials;
	}
	public void setTimeAndMaterials(boolean timeAndMaterials) {
		this.timeAndMaterials = timeAndMaterials;
	}
	
	//Constructors
	public Service(String name, int estimatedTaskDuaration, boolean timeAndMaterials) {
		this.estimatedTaskDuaration = estimatedTaskDuaration;
		this.name = name;
		this.timeAndMaterials = timeAndMaterials;
	}
	
	//Override methods
	public String toString() {
		return name + "(a " + estimatedTaskDuaration + " day service)";
	}

}
