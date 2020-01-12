package com.itchina.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollecege implements Collecege{
	List<Department> departments;
	public InfoCollecege() {
		departments = new ArrayList<Department>();
		addDepartment("java-大数据专业","java专业");
		addDepartment("java-大数据专业2","java专业");
		addDepartment("java-大数据专业3","java专业");
		addDepartment("java-大数据专业4","java专业");
	}
	@Override
	public String getName() {
		String name = "信息工程学院";
		return name;
	}
	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments.add(department);
	}
	@Override
	public Iterator createIterator() {
		return new InfoColleageIterator(departments);
	}
}
