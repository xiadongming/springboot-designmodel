package com.itchina.single;

public class SingleModelStaticDemo2 {

	private static  SingleModelStaticDemo2 singleModelStaticDemo = new SingleModelStaticDemo2();
	
  //private static  SingleModelStaticDemo2 singleModelStaticDemo2 = new SingleModelStaticDemo2();
	
	//private修饰，表明只能在本类中使用，不能在外部使用，不让外部通过new的方式产生对象实例
	private SingleModelStaticDemo2() {
	}
	
	public static  SingleModelStaticDemo2 getInstance() {
		return singleModelStaticDemo;
	}
	
}
