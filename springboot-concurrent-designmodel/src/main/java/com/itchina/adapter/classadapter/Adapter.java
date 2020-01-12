package com.itchina.adapter.classadapter;

public class Adapter extends VSource220V implements ITarget5V{

	@Override
	public int outPut5V() {
		int outPut220v = outPut220v();
		
		int d = outPut220v / 44;
		
		return d;
	}

}
