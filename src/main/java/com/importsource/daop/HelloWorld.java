package com.importsource.daop;


/**
 * 具体的业务逻辑
 * @author Hezf
 *
 */
public class HelloWorld{
	@AOP(value = "com.importsource.daop.MyMethodInterceptor")
	public String sayHello(String name){
		System.out.println("执行sayHello()");
		return "hello,"+name;
	}
}
