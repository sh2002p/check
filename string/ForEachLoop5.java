package com.rays.string;

public class ForEachLoop5 {
	public static void main(String[] args) {
		
		int sum = 0;
		int [] table =  { 11,1,2,3,5 };
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
			sum = sum + table[i];
			System.out.println("sum = " +sum); 

		}
		
		
	}

}
