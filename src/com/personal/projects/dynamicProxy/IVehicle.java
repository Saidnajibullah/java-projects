package com.personal.projects.dynamicProxy;

public interface IVehicle {

	public void start(int startTime, String speed);
	public void stop(int stopTime, String speed);
	public void forward();
	public void reverse();
	public String getName();
}
