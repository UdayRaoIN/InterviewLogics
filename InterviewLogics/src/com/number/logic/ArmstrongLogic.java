package com.number.logic;

public class ArmstrongLogic {
public static void main(String[] args) {
	int num=153;
	int temp=0;
	int duplicate=num;
	int digit=0;
	int count=num;
	
	System.out.println(digit);
	while(count>0) {
		System.out.println(digit);
		count=count/10;
		digit++;
	}
	System.out.println(count);	
	
	
	while(num>0) {
		int rem=num%10;
		temp=temp+(rem*rem*rem);
		num=num/10;
	}
	System.out.println(temp+" "+num);
	
	if(temp==duplicate) {
		System.out.println("armstrong number");
	}
}
}
