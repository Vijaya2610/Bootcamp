/* view the class Below        10 mins

  public class Customer 
 { 
   private String customerName;
   private String location;
   private String planType;
   private int planRange;
   private float amount;
//getter setter methods 
 } 

 #filter those customers whose planRange is above 3 months 
 #filter those customer whose plant amount is above 500 
 #calculate a discount of 20% over amount and add to amount to diplay for all customer of location Mumbai
 #Return object of customer based on below requirement 
           run an allMatch to check if all customer planRange is above 300
           run an anyMatch to check any customer with planRange above 600  */


package com.mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Exercise1 {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer("John", "Mysore", 4, "Type1", 600));
		customers.add(new Customer("Jenny", "Delhi", 2, "Type2", 700));
		customers.add(new Customer("James", "Bangalore", 5, "Type1", 450));
		customers.add(new Customer("Eve", "Mumbai", 6, "Type2", 300));

        Stream<Customer> stream = customers.stream();
        stream.filter(customer -> customer.getPlanRange() > 3).forEach(System.out::println);
        //stream.filter(customer -> customer.getAmount() > 500).forEach(System.out::println);
        //stream.filter(customer -> customer.getLocation().equalsIgnoreCase("Mumbai")).peek(customer -> customer.setAmount(customer.getAmount() * 0.8f)).forEach(System.out::println);        

        
        boolean allPlanRangeAbove300 = customers.stream().allMatch(customer -> customer.getPlanRange() > 300);

       
        boolean anyPlanRangeAbove600 = customers.stream().anyMatch(customer -> customer.getPlanRange() > 600);

        System.out.println("Customers' planRange above 300: \n" + allPlanRangeAbove300);
        System.out.println("Customer's planRange above 600: \n" + anyPlanRangeAbove600);
    }
}
