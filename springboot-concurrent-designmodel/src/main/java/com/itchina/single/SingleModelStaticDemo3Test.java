package com.itchina.single;

public class SingleModelStaticDemo3Test {
	public static void main(String[] args) {
		
		SingleModelStaticDemo3 instance = SingleModelStaticDemo3.getInstance();
		SingleModelStaticDemo3 instance2 = SingleModelStaticDemo3.getInstance();
		
		System.out.println(instance);
		System.out.println(instance2);
		System.out.println(instance == instance2);
		
	}

}
