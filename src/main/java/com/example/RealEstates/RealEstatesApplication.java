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
	//@PostConstruct służy do oznaczenia metody, która ma być wywołania PO zainicjowaniu i utworzeniu instancji danej klasy przez Spring.
	// W tej klasie ta metoda służy do wypełnienia repozytoriów przykładowymi danymi.
	public void init(){
		bootStrap.initializeRepository();
	}


	public static void main(String[] args) {
		SpringApplication.run(RealEstatesApplication.class, args);
	}

}
