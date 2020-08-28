package com.factory.main;

import com.factory.Car;
import com.factory.CarFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		CarFactory factory=new CarFactory();
		
		
		Car c1=factory.getCar("edurekacar");
		c1.start();
		c1.drive();
		c1.applyBreak();
		c1.stop();
		System.out.println();
		Car c2=factory.getCar("xyzcar");
		c2.start();
		c2.drive();
		c2.applyBreak();
		c2.stop();

	}

}
