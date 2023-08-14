/*create a stream of below given value using a builder 
   "BaudeRate"
   "Ohm"
   "Kilowatt"
   "Bits"
   "Analog"
   "Digital"
   Iterate through the stream using forEach loop 

#Create a stream using iterator function for fibonnaci series 

#Create a stream using generator function to print prime numbers 
*/

package com.mystream;

import java.util.stream.*;

public class Exercise2 {

	public static void main(String[] args) {
		
		Stream.Builder<String> builder=Stream.builder();
		builder.add("BaudeRate");
		builder.add("Ohm");
		builder.add("Kilowatt");
		builder.add("Bits");
		builder.add("Analog");
		builder.add("Digital");
		builder.build().forEach(System.out::println);

        
		Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]}).limit(20).map(s -> s[0]).forEach(System.out::println);

		IntStream.iterate(2, n -> n + 1).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).limit(20).forEach(System.out::println);
        
	}

}
