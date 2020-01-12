package com.itchina.template;

public class Tea extends RereshBaverage{

	@Override
	protected void brew() {
     System.out.println("用80度的谁冲泡茶叶");		
	}

	@Override
	protected void addCondiments() {
      System.out.println("加入柠檬");		
	}

}
