package com.cys.test;

import com.cys.service.ITriangleService;
import com.cys.service.impl.ITriangleServiceImpl;

public class Test2 {
	public static void main(String[] args) {
		double a = ITriangleServiceImpl.square((x,y)->x*y/2,10.2,10.8);
		System.out.println(a);
	}
	/*
	public  static double square(ITriangleService is,double x,double y) {
		
		return is.square(x,y);
	}*/
	
}
