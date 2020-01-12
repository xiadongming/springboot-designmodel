package com.itchina.proxy.staticproxy;

public class StaticProxyTest {
	public static void main(String[] args) {
        //被代理对象		
		TeacherDao teacherDao = new TeacherDao();
		//代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		teacherDaoProxy.teacher();
	
	}

}
