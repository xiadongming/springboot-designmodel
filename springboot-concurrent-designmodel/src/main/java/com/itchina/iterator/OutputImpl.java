package com.itchina.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	List<Collecege> collegeList;
	public OutputImpl(List<Collecege> collegeList) {
		this.collegeList = collegeList;
	}
	public void printCollecege() {
		Iterator<Collecege> iterator = collegeList.iterator();
		while(iterator.hasNext()) {
			Collecege nextCollecege = iterator.next();
			System.out.println("======"+nextCollecege.getName()+"=========");
			printDepartment(nextCollecege.createIterator());
		}
	}
	private void printDepartment(Iterator createIterator) {
		while(createIterator.hasNext()) {
			Department nextDepartment = (Department)createIterator.next();
			System.out.println(nextDepartment.getName());
			
		}
	}
	

}
