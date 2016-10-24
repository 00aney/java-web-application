package io.aney.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.aney.domain.User;

@Controller
public class HomeController {

	@GetMapping("")
	public String createUser(User user) {
		return "index";
	}
}
