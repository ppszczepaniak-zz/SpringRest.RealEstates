package com.example.RealEstates;

import com.example.RealEstates.utils.BootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RealEstatesApplication {

	private BootStrap bootStrap;

	public RealEstatesApplication(BootStrap bootStrap){
		this.bootStrap = bootStrap;
	}

	@PostConstruct
	public void init(){
		bootStrap.initializeRepository();
	}


	public static void main(String[] args) {
		SpringApplication.run(RealEstatesApplication.class, args);
	}

}
