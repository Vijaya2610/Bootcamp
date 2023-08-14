package com.mystream;

import java.util.ArrayList;
import java.util.stream.*;

public class StreamOperation {

	public static void main(String[] args) {
		
		ArrayList<Device> list=new ArrayList<>();
		list.add(new Device("BSC","Peter"));
		list.add(new Device("Teleprinter","Edgar"));
		list.add(new Device("Modem","Mathew"));
		list.add(new Device("Connector","Samuel"));
		list.add(new Device("Terminal","Erric"));
		
		Stream<Device> stream=list.stream();
		
		stream.filter((e)->e.getTechnicianName().equals("Peter")).forEach(System.out::println);
		//map((e)->e.getTechnicianName().toUpperCase())
					}

}
