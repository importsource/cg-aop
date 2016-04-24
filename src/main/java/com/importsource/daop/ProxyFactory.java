package com.importsource.daop;
import net.sf.cglib.proxy.Enhancer;


/**
 * 代理工厂
 * @author Hezf
 *
 */
public class ProxyFactory {

	/*
	 * 获得代理对象
	 */
	public static Object getProxyObj(String clazz,AbstractMethodInterceptor methodInterceptor) throws Exception{
		
		Class<?> superClass = Class.forName(clazz);
		
		Enhancer hancer = new Enhancer();
		
		//设置代理对象的父类
		hancer.setSuperclass(superClass);
		
		//设置回调对象，即调用代理对象里面的方法时，实际上执行的是回调对象（里的intercept方法）。
		hancer.setCallback(methodInterceptor);
		
		//创建代理对象
		return hancer.create();
	}	
}