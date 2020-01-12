package com.itchina.strategy;

public class StrategyFactory {
	
	private Strategy strategy;

	public StrategyFactory(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void addEncrypt() {
		this.strategy.encrypt();
	}
	

}
