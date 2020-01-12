package com.itchina.factory.simple;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		
		SimpleFactory simpleFactory = new SimpleFactory();
		
		Pizza pizza = simpleFactory.getPizza("big");
		
		//LittlePizza pizza2 = (LittlePizza)simpleFactory.getPizza("big");//报错
		
		BigPizza pizza3 = (BigPizza)simpleFactory.getPizza("big");
	}

}
