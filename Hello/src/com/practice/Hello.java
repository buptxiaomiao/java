package com.practice;
import java.util.*;

public class Hello {
	public static void main(String[] args) {
		System.out.println("hello...");
		HashMap m1 = new HashMap();
		HashMap m2 = new HashMap();
		int[] a = new int[3];
		for (int i: a) {
			a[i] = i+1;
		}
		m1.put("aaa", 111);
		m1.put("bbb", "dsadj");
		m1.put("ccc", 333);
		m2.put("ddd", 222);
		m2.put("eee", a);
		System.out.println();
		System.out.println("Map Elements");
		System.out.println(m1);
		System.out.println(m1.get("aaa"));
		System.out.println(m1.isEmpty());
		m1.putAll(m2);
		m1.remove("bbb");
		System.out.println(m1);
		System.out.println(m1.values());
	}

	
	public static void sss() {
		System.out.println(22222);
	}
}
