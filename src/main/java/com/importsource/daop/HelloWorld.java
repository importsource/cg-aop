package com.importsource.daop;

/**
 * 具体的业务逻辑
 * @author Hezf
 *
 */
public class HelloWorld{
	
	public String sayHello(String name){
		System.out.println("执行sayHello()");
		return "hello,"+name;
	}
}
