package com.itchina.iterator;

import java.util.Iterator;
//学院
public interface Collecege {

	public String getName();
	
	public void addDepartment(String name,String desc);
	
	public Iterator createIterator();
	
	
	
}
