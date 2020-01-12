package com.itchina.strategy;

public class SHA1Strategy implements Strategy{

	@Override
	public void encrypt() {

		System.out.println("使用SHA1进行加密");
	}

}
