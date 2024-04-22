package lv.venta.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	
	@GetMapping("/hello") //localhost:8080/hello
	public String getHello() {
		System.out.println("The first controller is working!!!");
		return "hello-page";//it will show hello-page.html file in the browser
	}
	
	Random rand = new Random();
	@GetMapping("/hello/msg") //localhost:8080/hello/msg
	public String getHelloMsg(Model model)
	{
		System.out.println("The second controller is working!!!");
		model.addAttribute("mypackage", "Hello from JAVA: " + rand.nextInt(0, 100));
		return "hello-msg-page";//it will show hello-msg-page.html file in the browser
	}
	
	
	//TODO
	//1. create git repo and push this project
	//2. create model package as lv.venta.model
	//3. create a new model class Product in this package (id, title, description, price, quantity)
	
	
}
