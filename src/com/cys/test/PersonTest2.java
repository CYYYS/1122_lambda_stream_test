package com.cys.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.cys.pojo.Person;

public class PersonTest2 {
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		Person p1 = new Person(1,"xiaoming",10000.1);
		Person p2 = new Person(2,"xiaoming",8000.1);
		Person p3 = new Person(3,"xiaoming",10080.0);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		List<Person> list2 = findMatchPerson(people,p->p.getId()==3);
		System.out.println(list2);
	}
	
	public static List<Person> findMatchPerson(List<Person> people,Predicate<Person> p){
		/*List<Person> newList = new ArrayList<>();
		for(int i=0;i<people.size();i++) {
			if(p.test(people.get(i))) {
				newList.add(people.get(i));
			}
		}
		return newList;*/
		return people.stream().filter(p).collect(Collectors.toList());
		
	}
}
