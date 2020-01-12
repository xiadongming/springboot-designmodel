package com.itchina.adapter.objectadapter;

public class Phone {
	
	//进行充电
	public  void addPower(ITarget5V target5V) {
		
		if(target5V.outPut5V() == 5) {
			System.out.println("电压为5v，可以充电");
		}else {
			System.out.println("不能充电");
		}

	}
	

}
