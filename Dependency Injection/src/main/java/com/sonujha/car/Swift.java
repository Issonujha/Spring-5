package com.sonujha.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sonujha.interfac.Car;
import com.sonujha.interfac.Engine;


public class Swift implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	
	
	
	
	


	/*
	 * @Autowire
	public void setEngine(Engine engine) {
		engine.type = "New V8";
		this.engine = engine;
	}*/



	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "A Swift Dzire "+ engine.type();
	}

}
