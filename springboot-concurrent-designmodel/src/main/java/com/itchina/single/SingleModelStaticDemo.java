package com.itchina.single;

public class SingleModelStaticDemo {

	//private修饰，表明只能在本类中使用，不能在外部使用，
	private SingleModelStaticDemo() {
	
	}

	public static SingleModelStaticDemo getInstance() {
		return new SingleModelStaticDemo();
	}
	
	
}
