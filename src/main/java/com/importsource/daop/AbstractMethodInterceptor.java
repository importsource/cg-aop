package com.importsource.daop;
import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public abstract  class AbstractMethodInterceptor implements MethodInterceptor{

/** 
 * 切面逻辑
* obj 代理对象实例 
* method 源对象的方法名 
* args 传递给方法的实际入参 
* proxyMethod 与源对象中的method相对应的代理对象中的方法 
* @author Hezf
*/ 
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		//执行源对象的method方法
		Object returnValue;
		try {
			before(obj,method,args,proxy);
			returnValue = proxy.invokeSuper(obj, args);
			after(obj,method,args,proxy);
			return returnValue;
		} catch (Exception e) {
			exception(obj,method,args,proxy);
		}finally{
			finalize(obj,method,args,proxy);
		}
		return null;
	}

	protected abstract void finalize(Object obj, Method method, Object[] args, MethodProxy proxy) ;

	protected abstract void exception(Object obj, Method method, Object[] args, MethodProxy proxy) ;
	
	protected abstract void after(Object obj, Method method, Object[] args, MethodProxy proxy) ;

	protected abstract void before(Object obj, Method method, Object[] args, MethodProxy proxy) ;
}
