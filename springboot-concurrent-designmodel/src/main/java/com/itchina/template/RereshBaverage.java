package com.itchina.template;

//制作饮料
public abstract class RereshBaverage {

	public void prepareTemplate() {
		//烧水，是公共方法
		boilWater();
		//炮制饮料原料，不是公共方法
		brew();
		//将饮料原料放到水杯中 ，公共方法
		inCup();
		//加入调味料，不是公共方法
		addCondiments();
	}

	private void boilWater() {
		System.out.println("烧水，是公共方法");
	}
	private void inCup() {
        System.out.println("将饮料放入水杯，是公共方法");		
	}
	protected abstract void brew();

	protected abstract void addCondiments();




	
}
