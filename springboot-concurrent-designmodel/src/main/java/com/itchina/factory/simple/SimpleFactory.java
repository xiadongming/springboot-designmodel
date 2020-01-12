package com.itchina.factory.simple;

public class SimpleFactory {

	public Pizza getPizza(String pizzaName) {

		if (pizzaName.equals("big")) {

			return new BigPizza();
		} else if (pizzaName.equals("little")) {
			return new LittlePizza();
		} else {
			System.out.println("不能生产");
		}
		return null;
	}
}
