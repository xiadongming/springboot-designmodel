package com.itchina.prototype;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Pig pig = new Pig();
		pig.setName("夏东明");
		
		Sheep sheep = new Sheep("tom","20","白色",pig);
		
		Sheep cloneSheep = (Sheep)sheep.clone();
		Sheep cloneSheep2 = (Sheep)sheep.clone();

		pig.setName("吕瑞娜");
		cloneSheep2.setPig(pig);
		System.out.println(cloneSheep);
		System.out.println(cloneSheep2);
		
	}

}
