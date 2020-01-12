package com.itchina.factory.simple;

public abstract class Pizza {
	//protected,让子类能够调用
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
