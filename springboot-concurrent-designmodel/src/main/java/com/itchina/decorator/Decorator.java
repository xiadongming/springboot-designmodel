package com.itchina.decorator;
//定义装饰者
public abstract class Decorator implements People{

	private People people;
	
	public Decorator(People people) {
		this.people = people;
	}

	@Override
	public void drinking() {
		people.drinking();
	}

	@Override
	public void driving() {
		people.driving();
	}
}
