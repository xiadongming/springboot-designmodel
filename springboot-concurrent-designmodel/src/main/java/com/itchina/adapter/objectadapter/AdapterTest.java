package com.itchina.adapter.objectadapter;

public class AdapterTest {
	public static void main(String[] args) {
		
		System.out.println("=====对象适配器模式========");
		Phone phone = new Phone();
		phone.addPower(new Adapter(new VSource220V()));
		
	}

}
