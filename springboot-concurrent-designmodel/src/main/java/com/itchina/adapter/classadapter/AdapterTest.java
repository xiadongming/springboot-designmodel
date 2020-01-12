package com.itchina.adapter.classadapter;

public class AdapterTest {
	public static void main(String[] args) {
		
		System.out.println("=====类适配器模式========");
		Phone phone = new Phone();
		phone.addPower(new Adapter());
		
	}

}
