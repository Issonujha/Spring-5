package com.sonujha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sonujha.car.Swift;

@Configuration
@ComponentScan("com.sonujha")
public class AppConfig {
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}

	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8("Level up Engine");
	}
	
}
