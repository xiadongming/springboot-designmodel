package com.itchina.decorator;

public class DecoratorMan extends Decorator{
	public DecoratorMan(People people) {
		super(people);
	}
	@Override
	public void drinking() {
		lookingForCar();
		super.drinking();
	}
	@Override
	public void driving() {
		lookingForWine();
		super.driving();
	}
	public void lookingForWine() {
		System.out.println("========找到啤酒===进行增强===");
	}
	public void lookingForCar() {
		System.out.println("=====找到汽车====进行增强=");
	}
}
