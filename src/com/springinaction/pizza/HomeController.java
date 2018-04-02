package com.springinaction.pizza;

import static org.apache.log4j.Logger.getLogger;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger LOGGER = getLogger(HomeController.class);

	@RequestMapping("/")
	public String redirectToFlow() {
		LOGGER.warn("Inside HomeController:redirectToFlow() method.");
		return "redirect:/pizza";
	}

}
