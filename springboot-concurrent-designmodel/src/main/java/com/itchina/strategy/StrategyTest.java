package com.itchina.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		
		MD5Strategy md5Strategy = new MD5Strategy();
		
		StrategyFactory strategyFactory = new StrategyFactory(md5Strategy);
		
		strategyFactory.addEncrypt();
	}

}
