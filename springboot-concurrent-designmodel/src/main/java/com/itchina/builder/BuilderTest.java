package com.itchina.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		HouseDirector houseDirector = new HouseDirector();
	
		HightHouseBuilder hightHouseBuilder = new HightHouseBuilder();
		House contractHouse = houseDirector.contractHouse(hightHouseBuilder);
		System.out.println(contractHouse);
		
		
		CommHouseBuilder commHouseBuilder = new CommHouseBuilder();
		House contractHouse2 = houseDirector.contractHouse(commHouseBuilder);
		System.out.println(contractHouse2);
		
	}
}
