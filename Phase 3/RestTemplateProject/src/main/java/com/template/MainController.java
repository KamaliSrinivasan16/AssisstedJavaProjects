package com.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController 
{
	@GetMapping("/info")
	public String display()
	{
		RestTemplate rt = new RestTemplate();
		Product p = rt.getForObject("http://localhost:8081/productinfo", Product.class);
		return p.toString();
	}

}
