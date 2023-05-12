package com.sonujha.car;

import org.springframework.stereotype.Component;

import com.sonujha.interfac.Car;

@Component("toyota")
public class Toyota implements Car {

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "A Toyota Call";
	}

}
