package com.itchina.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		
		Man man = new Man();
		DecoratorMan decoratorMan = new DecoratorMan(man);
		
		decoratorMan.drinking();
		decoratorMan.driving();
	}

}
