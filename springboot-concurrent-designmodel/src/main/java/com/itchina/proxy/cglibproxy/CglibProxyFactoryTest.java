package com.itchina.proxy.cglibproxy;

public class CglibProxyFactoryTest {
	public static void main(String[] args) {
		
		TeacherDao teacherDao = new TeacherDao();
		CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(teacherDao);
		
		TeacherDao teacherDaoproxyInstance = (TeacherDao)cglibProxyFactory.getProxyInstance();
	
		teacherDaoproxyInstance.teacher();
		
		System.out.println(teacherDaoproxyInstance.getClass());
	
	}

}
