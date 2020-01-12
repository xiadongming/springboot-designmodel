package com.itchina.adapter.objectadapter;

public class Adapter implements ITarget5V{

	private VSource220V  source220V;
	
	public Adapter(VSource220V source220v) {
		source220V = source220v;
	}
	@Override
	public int outPut5V() {
		int outPut220v = source220V.outPut220v();
		
		int d = outPut220v / 44;
		
		return d;
	}

}
