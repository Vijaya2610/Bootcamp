package com.mystream;

public class Customer {
	private String customerName;
	   private String location;
	   private int planRange;
	   private String planType;
	   private float amount;
	   
	   
	public Customer(String customerName, String location,int planRange, String planType, float amount) {
		super();
		this.customerName = customerName;
		this.location = location;
		this.planType = planType;
		this.planRange = planRange;
		this.amount = amount;
	}
	
	public Customer(){
		
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public int getPlanRange() {
		return planRange;
	}
	public void setPlanRange(int planRange) {
		this.planRange = planRange;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", location=" + location + ", planRange=" + planRange
				+ ", planType=" + planType + ", amount=" + amount + "]";
	}

	 

}
