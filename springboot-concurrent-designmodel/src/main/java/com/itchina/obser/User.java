package com.itchina.obser;
//具体观察者
public class User implements Observer{

	@Override
	public void update(String message) {
         System.out.println("收到消息   "+ message);		
	}

}
