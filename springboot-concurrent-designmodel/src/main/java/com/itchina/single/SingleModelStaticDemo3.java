package com.itchina.single;

public class SingleModelStaticDemo3 {
	
	private static SingleModelStaticDemo3 singleModelStaticDemo3 ;
	
	static {
		singleModelStaticDemo3 = new SingleModelStaticDemo3();
	}
	
	private SingleModelStaticDemo3() {
		
	}
	
	public static SingleModelStaticDemo3 getInstance() {
		return singleModelStaticDemo3;
	}

}
