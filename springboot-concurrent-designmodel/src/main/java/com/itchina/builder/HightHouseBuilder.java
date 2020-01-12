package com.itchina.builder;

public class HightHouseBuilder implements Builder{
	private House house;
	public HightHouseBuilder() {
        house = new House();
	}
	@Override
	public void buildBaseic() {
       house.setBasic("洋房的地基");
		System.out.println("洋房的地基");		
	}
	@Override
	public void buildWalls() {
		house.setWalls("洋房的墙面");
		System.out.println("洋房的墙");		
	}
	@Override
	public void buildRooFed() {
		house.setRooFed("洋房的房顶");
      System.out.println("洋房的房顶");		
	}
	@Override
	public House buildHouse() {
		return house;
	}
}
