package com.practice;

public class En {
	public static void main(String[] args) {
//		饿汉单例
		for (int i=0; i< 100; i++) {
			A tmp = A.getInstance();
			System.out.println(tmp);
		}
//		懒汉单例
		for (int i=0; i< 100; i++) {
			B tmp = B.getInstance();
			System.out.println(tmp);
		}
	}
}

//单例模式--饿汉
//在类初始化时调用
class A{
	public A() {
		System.out.println("hello...");
	}
	private static final A tmp_a = new A();
	private static int count = 0;
	public static A getInstance() {
		count += 1;
		System.out.println(count);
		return tmp_a;
	}
}

//单例模式--懒汉
//在第一次调用时实例化
class B{
	public B() {
		System.out.println("hello...bbbb");
	}
	private static B tmp_b = null;
	private static int count = 0;
	public static B getInstance() {
		System.out.println(count++);
		if (tmp_b == null) {
			tmp_b = new B();
		}
		return tmp_b;
	}
}
