package com.string.logic;

public class ReverseLogic {
public static void main(String[] args) {
	String name="uday";
	
	char[] nameChar=name.toCharArray();
	
	for(int i=nameChar.length-1;i>=0;i--) {
		System.out.println(nameChar[i]);
	}
}
}
