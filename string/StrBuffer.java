package com.rays.string;

public class StrBuffer {
	public static void main(String[] args) {
		String s1 = "java ";
		String s2 = "java ";
		String s3 = new String("core ");
		String s4 = new String("core ");
		StringBuffer sb = new StringBuffer ("hello");
		sb.append (" java ");
		sb.append (" How are you ");
		System.out.println(sb.append(s1+s4));
		
			
	}

}
 