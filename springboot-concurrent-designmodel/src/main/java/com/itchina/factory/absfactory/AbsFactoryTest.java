package com.itchina.factory.absfactory;

public class AbsFactoryTest {
	public static void main(String[] args) {
		
		AbsFactory bjFactory = new BJFactory();
		Pizza pizza = bjFactory.getPizza("big");
		
		
		AbsFactory lunDFactory = new LunDFactory();
		
		lunDFactory.getPizza("little");
		
	}

}
