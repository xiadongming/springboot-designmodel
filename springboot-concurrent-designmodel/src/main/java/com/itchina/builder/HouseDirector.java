package com.itchina.builder;

public class HouseDirector {

	public House contractHouse(Builder builder) {
		builder.buildBaseic();
		builder.buildWalls();
		builder.buildRooFed();
		
		return builder.buildHouse();
	}
	
	
}
