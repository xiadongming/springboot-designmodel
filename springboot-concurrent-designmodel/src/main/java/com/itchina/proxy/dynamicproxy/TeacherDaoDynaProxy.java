package com.itchina.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TeacherDaoDynaProxy implements InvocationHandler {
	
	//被代理对象
	private Object object;

	public TeacherDaoDynaProxy(Object object) {
		this.object = object;
	}
	/**
	 * 所有执行代理对象的方法都会被替换成执行invoke方法
	 * proxy  动态代理后生成的对象
	 * args   参数
	 * ***/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/***开始动态代理***/
		
		Object invokeResult = method.invoke(object, args);
		/***结束动态代理***/
		System.out.println("被代理对象=="+object.getClass());
		
		return invokeResult;
	}

}
