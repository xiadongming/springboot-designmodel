package com.itchina.factory.factorymethod;

public class BJLittlePizzaFactory extends FactoryMethodFactory{

	@Override
	public Pizza getPizza() {
		return new BJLittlePizza();
	}

}
