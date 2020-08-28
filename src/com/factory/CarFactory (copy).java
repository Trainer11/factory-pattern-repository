package com.factory;

import com.factory.impl.EdurekaCar;
import com.factory.impl.XyzCar;

public class CarFactory {

	public Car getCar(String carName) {
		if(carName ==  null) {
			return null;
		}else if (carName.equalsIgnoreCase("EdurekaCar")) {
			return new EdurekaCar();
		}else if (carName.equalsIgnoreCase("Xyzcar")) {
			return new XyzCar();
		}else {
			return null;
		}
		
	}
}
