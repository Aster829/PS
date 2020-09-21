package program.study.ps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/HelloWorld")
	public String HelloWorld() {
	    return "HelloWorld";
	}

}
