package com.cys.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cys.pojo.Person;
import com.cys.service.IPersonService;

public class PersonTest{
	public static void main(String[] args) {
		List<Person>list = new ArrayList<>();
		List<Person>list2 = new ArrayList<>();
		Person p1 = new Person(1,"xiaoming",10000.1);
		Person p2 = new Person(2,"xiaoming",8000.1);
		Person p3 = new Person(3,"xiaoming",10000.0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		List<Person> list3 = findMatchPerson(p -> ((Person) p).getId()>1,list,list2);
		System.out.println(list3);
		
	}
	public static List<Person> findMatchPerson(IPersonService is,List<Person>  list,List<Person> newlist){
		for(int i=0;i<list.size();i++) {
			if(is.test(list.get(i))) {
				newlist.add(list.get(i));
			}
		}
		return newlist;
	}
}
