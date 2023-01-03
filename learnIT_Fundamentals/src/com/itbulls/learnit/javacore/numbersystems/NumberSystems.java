package com.itbulls.learnit.javacore.numbersystems;

public class NumberSystems {
	
	public static void main(String[] args) {
		//decimal
		int dec = 152;
		//binary -- 0b prefix
		int bin = 0b10011000;
		//octal -- 0 prefix
		int oct = 0230; 
		//hexadecimal -- 0x prefix
		int hex = 0x98;
		
		int ACDC = 0xACDC;
		
		System.out.println(dec);
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(ACDC);
	}
}