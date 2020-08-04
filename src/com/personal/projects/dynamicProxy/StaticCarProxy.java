package com.personal.projects.dynamicProxy;

public class StaticCarProxy implements IVehicle {
	
	private IVehicle car;
	StaticCarProxy(IVehicle car){
		this.car = car;
	}

	@Override
	public void start(int  t, String s) {
		System.out.println("Proxying " + car.getName() + "'s start method");
		car.start(t, "super fast");
		
	}

	@Override
	public void stop(int t, String s) {
		System.out.println("Proxying " + car.getName() + "'s stop method");
		car.stop(t, "super slow");
		
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
