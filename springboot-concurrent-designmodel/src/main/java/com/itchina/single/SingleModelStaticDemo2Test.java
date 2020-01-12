package com.itchina.single;

public class SingleModelStaticDemo2Test {
	
	public static void main(String[] args) {

		SingleModelStaticDemo2 instance1 = SingleModelStaticDemo2.getInstance();
		SingleModelStaticDemo2 instance2 = SingleModelStaticDemo2.getInstance();
	
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
