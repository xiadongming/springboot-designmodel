package com.itchina.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyFactory implements MethodInterceptor {
	// 被代理对象
	private Object object;
	public CglibProxyFactory(Object object) {
		this.object = object;
	}
	// 获取一个代理对象
	public Object getProxyInstance() {
		Enhancer enhancer = new Enhancer();
		// 设置父类，父类是被代理对象
		enhancer.setSuperclass(object.getClass());
		// 设置回调函数,,即实际调用的是这个对象,即代理对象
		enhancer.setCallback(this);
		// 创建子类对象
		Object createEnhancer = enhancer.create();
		return createEnhancer;
	}

	//当调用父类object的方法的时候，会触发拦截方法intercept()
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("====开始cglib代理=======");
		Object invoke = method.invoke(object, args);
		System.out.println("====结束cglib代理=======");
		return invoke;
	}
}
