package com.itchina.builder;

public interface Builder {

	public void buildBaseic();
	
	public void buildWalls();
	
	public void buildRooFed();
	
	//在具体实现类中，此方法调用上边的方法buildBasic()，buildWalls()等
	public House buildHouse();
	
	
}
