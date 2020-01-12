package com.itchina.decorator;

public class Man implements People{

	@Override
	public void drinking() {
		System.out.println("喝酒");
		
	}
	@Override
	public void driving() {
		System.out.println("开车");
	}

}
