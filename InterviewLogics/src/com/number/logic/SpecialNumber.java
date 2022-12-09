package com.number.logic;

public class SpecialNumber {
public static void main(String[] args) {
	int number=145;
	int last;
	int sumFact=0;
	int temp=number;
	
	while(number>0) {
		last=number%10;
		int fact=1;
		for(int i=1;i<=last;i++) {
			fact=fact*i;
		}
		sumFact=sumFact+fact;
		number=number/10;
	}
	
	if(temp==sumFact) {
		System.out.println("special number");
	}
}
}
