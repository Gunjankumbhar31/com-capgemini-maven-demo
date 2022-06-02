package com.capgemini.demo.lamb;

import java.util.*;

public class LambdaDemo {
	
	// object can't be created for an interface 
//	SomeInterface obj = new SomeInterface();
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(54);
		numbers.add(4);
		numbers.add(48);
		numbers.add(10);
		numbers.add(85);
		numbers.forEach((n) -> {System.out.println(n);});
		
	}
}
