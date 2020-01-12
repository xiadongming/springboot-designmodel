package com.itchina.adapter.interfaceadapter;

public class Adapter extends AbsAdapter implements ITarget5V{


	@Override
	public int outPut5V() {
		int outPutPower = outPutPower();
		if(outPutPower != 5) {
			return 5;
		} 
		return 0;
	}
	
}
