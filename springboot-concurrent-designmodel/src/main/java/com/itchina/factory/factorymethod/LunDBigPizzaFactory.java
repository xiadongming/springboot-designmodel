package com.itchina.factory.factorymethod;

public class LunDBigPizzaFactory extends FactoryMethodFactory{

	@Override
	public Pizza getPizza() {
		return new LunDBigPizza();
	}

}
