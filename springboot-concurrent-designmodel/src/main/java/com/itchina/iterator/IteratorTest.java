package com.itchina.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		List<Collecege> list = new ArrayList<Collecege>();
		
		list.add(new ComputerCollege());
		list.add(new InfoCollecege());
		
		OutputImpl outputImpl = new OutputImpl(list);
		
		
		outputImpl.printCollecege();
	}

}
