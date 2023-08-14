/*Observe class below  - 10 mins

   public class SurveyReport
 { 
   private int surveyId;
   private String employeeName;
   private String location ;
   private int total_connection_request;
   private int no_of_days_for_request_completion;
   private int average_request_per_day;
 //getter setter methods 


  }

#perform a max operation to find maximum number of requests received by adding total_connection_request 
#perform a reduce operation on no_of_days_for_request_completion for finding  average time for request completion
#find the total average_request_per_day
#find the location count for location Delhi
*/

package com.mystream;

import java.util.ArrayList;
import java.util.stream.*;

public class Exercise3 {

	public static void main(String[] args) {
		
		ArrayList<SurveyReport> list=new ArrayList<>();
		list.add(new SurveyReport(1,"Alex","Mumbai",5,10,4));
		list.add(new SurveyReport(2,"Ava","Delhi",4,8,5));
		list.add(new SurveyReport(3,"Jenny","Mysore",3,5,2));
		list.add(new SurveyReport(4,"John","Delhi",2,1,1));
		list.add(new SurveyReport(5,"James","Bangalore",1,1,1));
		
		Stream<SurveyReport> stream=list.stream();
		
		   int maxRequests = list.stream().mapToInt(SurveyReport::getTotal_connection_request).max().orElse(0); 
	       System.out.println("Maximum requests received: " + maxRequests);
	        /*SurveyReport maxRequests = list.stream().max((a,b)->{
				if(a.getTotal_connection_request() == b.getTotal_connection_request()) {
					return 0;
				}
				else if(a.getTotal_connection_request() > b.getTotal_connection_request())
				{
					return 1;
				}
				else return -1;
			}).get();
			
			System.out.println(maxRequests);*/

	       
	        double averageCompletionTime = list.stream().mapToInt(SurveyReport::getNo_of_days_for_request_completion).average().orElse(0.0);
	        System.out.println("Average time for request completion: " + averageCompletionTime);

	
	        double totalAverageRequestsPerDay = list.stream().mapToInt(SurveyReport::getAverage_request_per_day).average().orElse(0.0);
	        System.out.println("Total average_request_per_day: " + totalAverageRequestsPerDay);

	      
	        long locationCountDelhi = list.stream().filter((e) ->e.getLocation().equals("Delhi")).count();
	        System.out.println("Location count for Delhi: " + locationCountDelhi);
	}
}

	
