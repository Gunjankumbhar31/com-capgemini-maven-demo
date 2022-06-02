package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[] args) {
		
		List<Boolean> marks = new ArrayList<>();
		List<Integer> marks1 = new ArrayList<>();
		List<String> marks2 = new ArrayList<>();
		List<Double> marks3 = new ArrayList<>();
		
		marks1.add(98);
		marks1.add(95);
		marks3.add(98.88);
		marks3.add(78.88);
		marks2.add("abc");
		marks2.add("gunjan");
		marks.add(false);
		marks.add(true);
		
		System.out.println(marks);
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks3);
	}

}
