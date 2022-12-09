package com.java8.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpLogics {
	public static void main(String[] args) {
		Emp e1=new Emp(1, "uday");
		Emp e2=new Emp(7, "rao");
		Emp e3=new Emp(3, "sai");
		Emp e4=new Emp(4, "uday");
		
		List<Emp> l=new ArrayList<>(); 
		l.add(e1);
		l.add(e2);
		l.add(e3);
//		GroupBy
//		l.add(e4); 
		
		l.stream().sorted(Comparator.comparingInt(Emp::getId).reversed()).skip(1).forEach(System.out::println);
		
		System.out.println(l.stream().filter(x->x.getId()<=1).collect(Collectors.toList()));
		
		System.out.println(l.stream().map(x->x.getName()+"virtusan").collect(Collectors.toList()));
		
		l.stream().sorted((o1,o2)->o2.getId()-o1.getId()).forEach(System.out::println);
		
		l.stream().sorted(Comparator.comparing(Emp::getName)).forEach(System.out::println);

		BiPredicate<String, Integer> bi1=(name,id)->{
			return (name.equalsIgnoreCase("uday") || id == 1);
		};
		
		System.out.println(bi1.test(e1.getName(),e1.getId())); 
		
		Predicate<Integer> bi2=a->a%2==0 && a>0;
		Predicate<Integer> bi3=a->a!=0;
		
		System.out.println(bi2.and(bi3).test(4));
		
		BiPredicate<Integer, String> bi4=(id,name)->{ 
			return (id>0 && name.endsWith("virtusan"));
		};
		
		BiPredicate<Integer, String> bi5=(id,name)->{
			return (id>0 && name.startsWith("u"));
		};
		
		l.stream().filter(x->bi4.or(bi5).test(x.getId(), x.getName())).forEach(System.out::println);
		
		System.out.println(filterBadDomain(l, bi4, bi5));
		
		System.out.println(l.stream().collect(Collectors.groupingBy(Emp::getName)));
		
		
	}		
	
		public static <T extends Emp> List<T> filterBadDomain(
	            List<T> list, BiPredicate<Integer,String> biPredicate1,BiPredicate<Integer,String> biPredicate2) {
			
			return list.stream().filter(x->biPredicate1.or(biPredicate2).test(x.getId(),x.getName())).collect(Collectors.toList());
	}

}
