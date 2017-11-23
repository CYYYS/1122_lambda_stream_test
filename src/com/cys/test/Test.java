package com.cys.test;

import java.util.Arrays;
import java.util.Comparator;

import com.cys.service.Integrable;

public class Test {
	public static void main(String[] args) {
		double d1 = integrate(x -> x, 10, 100, 1000);
		System.out.println(d1);
		String[] strs = {"hello", "world", "what", "hi"};
		Comparator<String> c4 = String::compareTo;
		Arrays.sort(strs,c4);
		for(String s:strs) {
			
			System.out.println(s);
		}
	}
	
	public static double integrate(Integrable func, double x1, double x2, int numSlices) { 
		if (numSlices < 1) numSlices = 1;
		double delta = (x2 - x1) / numSlices;
		double start = x1 + delta / 2.0;
		double sum = 0.0;  
		for (int i = 0; i <numSlices; i++) {
			sum += delta * func.eval(start + delta * i);
		}
			return sum;
		}
}
