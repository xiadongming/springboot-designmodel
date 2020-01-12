package com.itchina.bridge;

public class BridgeTest {
	
	public static void main(String[] args) {

		Computer laptop = new Laptop(new Dell());
		laptop.sale();
		
		System.out.println("=============");
		
		Computer desktop = new Desktop(new Dell());
		desktop.sale();
	}

}
