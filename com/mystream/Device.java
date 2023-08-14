package com.mystream;

public class Device {
	
	private String name;
	private String technicianName;
	
	public Device(String name, String technicianName) {
		super();
		this.name = name;
		this.technicianName = technicianName;
	}
	
	
	public Device() {
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", technicianName=" + technicianName + "]";
	}
	
	

}
