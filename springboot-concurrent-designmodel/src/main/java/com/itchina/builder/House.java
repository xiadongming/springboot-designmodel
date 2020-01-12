package com.itchina.builder;
public class House {
	private String basic;
	private String walls;
	private String rooFed;
	public String getBasic() {
		return basic;
	}
	public void setBasic(String basic) {
		this.basic = basic;
	}
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getRooFed() {
		return rooFed;
	}
	public void setRooFed(String rooFed) {
		this.rooFed = rooFed;
	}
	@Override
	public String toString() {
		return "House [basic=" + basic + ", walls=" + walls + ", rooFed=" + rooFed + "]";
	}
	
}
