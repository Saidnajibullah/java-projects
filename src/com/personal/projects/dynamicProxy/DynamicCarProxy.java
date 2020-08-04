package com.personal.projects.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicCarProxy implements InvocationHandler {
	
	private IVehicle target;
	
	DynamicCarProxy(IVehicle t){
		this.target = t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Vehicle Handeler: Invoking " + method.getName());
		for(Object o: args) {
			System.out.println(o);
		}
		return method.invoke(target, args) ;
	}


}
