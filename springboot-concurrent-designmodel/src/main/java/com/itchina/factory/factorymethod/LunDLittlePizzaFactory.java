package com.itchina.factory.factorymethod;

public class LunDLittlePizzaFactory extends FactoryMethodFactory {

	@Override
	public Pizza getPizza() {
		return new LunDLittlePizza();
	}

}
