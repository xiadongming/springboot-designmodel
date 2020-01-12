package com.itchina.factory.absfactory;

public abstract class Pizza {
	//protected,让子类能够调用
	protected String name;

	 public abstract void Show();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
