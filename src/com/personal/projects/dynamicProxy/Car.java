package com.personal.projects.dynamicProxy;

public class Car implements IVehicle {
	
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	@Override
	public void start(int t, String s) {
		System.out.println("Car stated!, " + t + " " + s);
		
	}

	@Override
	public void stop(int t, String s) {
		System.out.println("Car stoped!, " + t + " " + s);
		
	}

	@Override
	public void forward() {
		System.out.println("Car is going forward...");
		
	}

	@Override
	public void reverse() {
		System.out.println("Car is going reverse");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


}
