package com.factory;

import com.factory.impl.EdurekaCar;
import com.factory.impl.XyzCar;
// changes made for third commit

//changes made for req2
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
