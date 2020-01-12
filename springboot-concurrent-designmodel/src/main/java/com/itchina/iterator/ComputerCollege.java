package com.itchina.iterator;

import java.util.Iterator;

public class ComputerCollege implements Collecege {
	Department[] department;
	int numberOfDepartment = 0;
	public ComputerCollege() {
		department = new Department[5];
		addDepartment("java专业","java专业");
		addDepartment("java专业2","java专业");
		addDepartment("java专业3","java专业");
		addDepartment("java专业4","java专业");
		addDepartment("java专业5","java专业");
	}
	@Override
	public String getName() {
		String name = "计算机学院";
		return name;
	}
	@Override
	public void addDepartment(String name, String desc) {
		Department department2 = new Department(name, desc);
		department[numberOfDepartment] = department2;
		numberOfDepartment += 1;
	}
	@Override
	public Iterator createIterator() {
		return new ComputerCollegeIterator(department);
	}

}
