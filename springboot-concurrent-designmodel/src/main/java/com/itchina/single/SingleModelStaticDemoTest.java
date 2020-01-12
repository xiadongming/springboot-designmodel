package com.itchina.single;

public class SingleModelStaticDemoTest {
	
	public static void main(String[] args) {

		SingleModelStaticDemo instance1 = SingleModelStaticDemo.getInstance();
		SingleModelStaticDemo instance2 = SingleModelStaticDemo.getInstance();
	
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
