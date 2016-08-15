package com.importsource.daop;
/**
 * 
 * @author Hezf
 *
 */
public class Test {

	public static void main(String[] args) {

		try {
			HelloWorld hello = (HelloWorld) ProxyFactory.getProxyObj(HelloWorld.class.getName(),new MyMethodInterceptor());
			System.out.println(hello.sayHello("hezhuofan"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
