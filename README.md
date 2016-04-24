# cg-aop
a AOP component with cglib


###sample code

```java
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

```

###定义一个interceptor

```java
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

```

###maven

```xml
  <dependency>
	  <groupId>com.importsource.daop</groupId>
    <artifactId>importsource-daop</artifactId>
    <version>0.0.1-SNAPSHOT</version>
  </dependency>
```
