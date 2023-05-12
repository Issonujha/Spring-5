package com.sonujha;


import com.sonujha.interfac.Engine;

public class V8 implements Engine {

	String type;
	
	
	
	
	
	public V8() {
		type = "Unknown";
	}





	public V8(String type) {
		this.type = type;
	}





	@Override
	public String type() {
		return type;
	}

}
