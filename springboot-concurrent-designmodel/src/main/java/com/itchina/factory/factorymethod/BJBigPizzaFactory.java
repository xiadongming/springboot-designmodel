package com.itchina.factory.factorymethod;

public class BJBigPizzaFactory extends FactoryMethodFactory{

	@Override
	public Pizza getPizza() {
		return new BJBigPizza();
	}

}
