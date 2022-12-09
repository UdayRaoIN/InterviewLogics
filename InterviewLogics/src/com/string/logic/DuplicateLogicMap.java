package com.string.logic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateLogicMap {
public static void main(String[] args) {
	String name="udayasan";
	char[] charName=name.toCharArray();
	Map<Character, Integer> m=new HashMap<>();
	for(int i=0;i<name.length();i++) {
		if(m.containsKey(charName[i])) {
			m.put(charName[i], m.get(charName[i])+1);
		}
		else {
			m.put(charName[i], 1);
		}
	}
	
	m.entrySet().forEach(System.out::println);
}
}
			