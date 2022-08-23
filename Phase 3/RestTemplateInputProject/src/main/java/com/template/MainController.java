package com.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@GetMapping("/productinfo")
	public Product getProduct()
	{
		Product p = new Product();
		p.setPid("1");
		p.setPname("Apple");
		return p;
	}
}
