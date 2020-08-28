package com.factory.impl;

import com.factory.Car;

public class XyzCar implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("XyzCar started");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("XyzCar is in Driving state");
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("XyzCar applied breaks");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("XyzCar stopped");
	}

}
