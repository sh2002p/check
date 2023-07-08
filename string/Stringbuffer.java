package com.rays.string;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" bittu ");
		sb.append(" Shradha pushpad");
		System.out.println("Length:" +sb.length());
		System.out.println("Capacity;" +sb.capacity());
		System.out.println("char at:"+sb.charAt(5));
		System.out.println("Index of "+sb.indexOf("u"));
		System.out.println("Reverse:"+sb.reverse());
		 
	}
	

}
