package com.itchina.factory.factorymethod;

public class FactoryMethodFactoryTest {
	
	public static void main(String[] args) {
		
		//客户想要BJBigPizza
		FactoryMethodFactory bjBigPizzaFactory = new BJBigPizzaFactory();
		Pizza BJBigPizza = bjBigPizzaFactory.getPizza();
		BJBigPizza.Show();
		
		
		//客户想要伦敦披萨LunDlittlePiza
		FactoryMethodFactory lunDLittlePizzaFactory = new LunDLittlePizzaFactory();
		Pizza LunDLittlePizza = lunDLittlePizzaFactory.getPizza();
		LunDLittlePizza.Show();
	
	}

}
