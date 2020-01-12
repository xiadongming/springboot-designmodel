package com.itchina.factory.absfactory;

public class LunDFactory implements AbsFactory{
	/**
	 * 和工厂方法模式不同，
	 * 工厂方法模式：一个工厂只生产一种披萨，bjbig工厂，bjlittile工厂，lundbig工厂，lunlittle工厂
	 * 抽象工厂模式：一个工厂生成一个地区的所有披萨，bjbig和bjlittle在一个工厂，lundbig和lundlittle一个工厂
	 * **/
	@Override
	public Pizza getPizza(String pizzaName) {
		if(pizzaName.equals("big")) {
			return new LunDBigPizza(); 
		}else if(pizzaName.equals("little")) {
			return new LunDLittlePizza();
		}else {
			System.out.println("bjfactory不能生产");
		}
		return null;
	}

}
