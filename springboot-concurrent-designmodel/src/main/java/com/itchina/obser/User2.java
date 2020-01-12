package com.itchina.obser;

public class User2 implements Observer{

	@Override
	public void update(String message) {

		System.out.println("user2 收到信息  " + message);
		
	}

}
