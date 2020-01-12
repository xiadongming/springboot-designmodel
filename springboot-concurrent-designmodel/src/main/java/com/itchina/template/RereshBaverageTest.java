package com.itchina.template;

public class RereshBaverageTest {
	public static void main(String[] args) {
		
		//咖啡
		RereshBaverage rereshBaverage = new Coffee();
		rereshBaverage.prepareTemplate();
		
		System.out.println("=================");
		//茶叶
		RereshBaverage rereshBaverage2 = new Tea();
		rereshBaverage2.prepareTemplate();
	}

}
