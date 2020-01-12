package com.itchina.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class TeacherDaoDynaProxyTest {

	public static void main(String[] args) {

		ITeacherDao teacherDao = new TeacherDao();
		// 是一个invokehandler，，即是一个handler
		TeacherDaoDynaProxy teacherDaoDynaProxy = new TeacherDaoDynaProxy(teacherDao);

		System.out.println("teacherDaoDynaProxy   "+teacherDaoDynaProxy.getClass());
		// teacherDaoDynaProxy.invoke(proxy, method, args)

		ITeacherDao dynamicProxy = (ITeacherDao) Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(),
				                                       teacherDao.getClass().getInterfaces(), teacherDaoDynaProxy);
		dynamicProxy.teacher();
		
		
		System.out.println("=====================");
		System.out.println("+++      "+dynamicProxy.getClass());

	}

}
