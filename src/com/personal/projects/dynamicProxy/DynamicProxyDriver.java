package com.personal.projects.dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDriver {

	public static void main(String[] args) {
		
		IVehicle myCorolla = new Car("Red Corolla");
		DynamicCarProxy proxy = new DynamicCarProxy(myCorolla);
		
		IVehicle v = (IVehicle) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[] {IVehicle.class}, proxy);
		v.start(3, "super fase");
		v.stop(5, "super slow");
		

	}

}
