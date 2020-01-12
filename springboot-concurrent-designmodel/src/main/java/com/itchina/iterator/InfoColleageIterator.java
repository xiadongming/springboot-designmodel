package com.itchina.iterator;

import java.util.Iterator;
import java.util.List;
//信息工程学院
public class InfoColleageIterator implements Iterator{
	//是以集合的形式存放
	List<Department> departments;
	int index = 0;
	public InfoColleageIterator(List<Department> departments) {
		this.departments = departments;
	}
	@Override
	public boolean hasNext() {
		if(index >= departments.size()) {
			return false;
		}else {
			return true;
		}
	}
	@Override
	public Object next() {
		Department department = departments.get(index);
		index += 1;
		return department;
	}
}
