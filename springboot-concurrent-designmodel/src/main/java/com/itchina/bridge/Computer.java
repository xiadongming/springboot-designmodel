package com.itchina.bridge;

public class Computer {

	public Brand brand;

	public Computer(Brand brand) {
		this.brand = brand;
	}

   public void sale() {
	   brand.sale();
   }
	
	
	
	
}
