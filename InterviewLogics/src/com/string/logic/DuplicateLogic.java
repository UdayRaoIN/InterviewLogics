package com.string.logic;

public class DuplicateLogic {
	public static void main(String[] args) {
		String name="udayasan";
		char[] charName=name.toCharArray();
		int[] freq=new int[charName.length];

		for(int i=0;i<charName.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<charName.length;j++) {
				if(charName[i]==charName[j]) {
					charName[j]='0';
					freq[i]++;
				}
			}
		}
		for(int i=0;i<charName.length;i++) {
			if(charName[i]!='0') {
				System.out.println(charName[i]+""+freq[i]);
			}
		}
	}
}
