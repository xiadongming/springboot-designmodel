package com.itchina.builder;

public class CommHouseBuilder implements Builder {
	private House house;
	public CommHouseBuilder() {
		house = new House();
	}
	@Override
	public void buildBaseic() {
		house.setBasic("普通房子的地基");
		System.out.println("建造普通放在的地基");
	}
	@Override
	public void buildWalls() {
		house.setWalls("普通房子的墙面");
		System.out.println("建造普通房子的墙");
	}
	@Override
	public void buildRooFed() {
		house.setRooFed("普通的房子的房顶");
		System.out.println("建造普通防止的房顶");
	}
	@Override
	public House buildHouse() {
		return house;
	}

}
