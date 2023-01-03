package com.itbulls.primitives;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		// declaration and initialization
		byte b = 1;
		// declaration
		short s;
		// initialization 
		s = 2;
		int i = 3;
		long l = 4;
		
		char c = 'a';
		
		boolean bool = true;
		
		
		float f = 1.2f; 
		
		long l2 = 2_000_000_000_000L;
		
		double d = 1.3; 
		
		var v = 1;
		
		//converting primitive tpes -- can convert smaller type to bigger type
		// but not other way around
		
		// s = short
		int i3 = s; 
		System.out.println(i3);
		
		char c2 = 100; 
		System.out.println(c2);
		
		double d2 = i3;
		d2 = l;
		
		System.out.println(d2);
		
		b = (byte)i3; 
		
		long number = 499_999_999_000_000_001L;
		double converted = (double) number; 
		System.out.println(number - (long) converted);
		
		// Autoboxing and unboxing -- wrapper types 
		Integer i4 = 1;
		int i5 = i4; 
	}
}