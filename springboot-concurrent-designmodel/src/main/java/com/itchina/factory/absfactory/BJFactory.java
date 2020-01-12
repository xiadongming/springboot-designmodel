package com.itchina.factory.absfactory;

public class BJFactory implements AbsFactory{

	@Override
	public Pizza getPizza(String pizzaName) {
		if(pizzaName.equals("big")) {
			return new BJBigPizza();
		}else if(pizzaName.equals("little")) {
			return new BJLittlePizza();
		}else {
			System.out.println("lunDFactory不能生产这种披萨");
		}
		return null;
	}

}
