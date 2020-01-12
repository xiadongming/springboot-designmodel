package com.itchina.iterator;

import java.util.Iterator;
//计算机工程学院
public class ComputerCollegeIterator implements Iterator{
	//这里需要知道department是怎么样的方式存放，这里加入是数组的方式
	Department[] department;
	//遍历的位置
	int position = 0;
	public ComputerCollegeIterator(Department[] department) {
		this.department = department;
	}

	@Override
	public boolean hasNext() {
		if(position >= department.length || department[position] == null) {
			return false;
		}else {
			return true;
		}
	}
	@Override
	public Object next() {
		Department departEle = department[position];
		position += 1;
		return departEle;
	}
}
