package com.factory.impl;

import com.factory.Car;

public class EdurekaCar implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("EdurekaCar started");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("EdurekaCar is running");
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("EdurekaCar applied breaks");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("EdurekaCar stopped");
	}

	
}
