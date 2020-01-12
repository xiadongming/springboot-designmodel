package com.itchina.single.lazy;

public class SingleModelStaticDemo {

	private static SingleModelStaticDemo singleModelStaticDemo;

	private SingleModelStaticDemo() {

	}

	public static SingleModelStaticDemo getInstance() {
		if (null == singleModelStaticDemo) {
			
			singleModelStaticDemo = new SingleModelStaticDemo();
		}
		return singleModelStaticDemo;
	}
}
