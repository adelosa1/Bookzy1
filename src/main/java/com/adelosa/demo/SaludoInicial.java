package com.adelosa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class SaludoInicial {
	@GetMapping("/menu")
	public String SpringStarter()
	{
        Date date = new Date();
		return date + " <h1> Saludos desde la librería Bookzy</h1>";
	}

}
