package com.importsource.daop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor extends AbstractMethodInterceptor {

	@Override
	protected void finalize(Object obj, Method method, Object[] args, MethodProxy proxy) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void exception(Object obj, Method method, Object[] args, MethodProxy proxy) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void after(Object obj, Method method, Object[] args, MethodProxy proxy) {
		System.out.println("after");

	}

	@Override
	protected void before(Object obj, Method method, Object[] args, MethodProxy proxy) {
		System.out.println("before");

	}

}
