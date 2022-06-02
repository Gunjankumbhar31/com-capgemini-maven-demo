package com.capgemini.demo.lamb;

interface Addition{
	int add(int a, int b);


}

public class LambdaDemo2 {
	public static void main(String[] args) {
		
		// multiple parameter in lambda expression
		Addition ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(10,50));
		
		// multiple parameter with data type in lambda expression
		Addition ad2 = (int a,int b)->(a+b);
		System.out.println(ad2.add(40,80));
	}

}
