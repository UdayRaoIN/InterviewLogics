package com.number.logic;

public class PalindromeLogic {
public static void main(String[] args) {
	int num=121;
	int rev=0;
	
	while(num>0) {
		num=num/10;
		rev=rev+num*10;
		num=num%10;
	}
	
	if(rev==num) {
		System.out.println("palindrome");
	}
}
}
