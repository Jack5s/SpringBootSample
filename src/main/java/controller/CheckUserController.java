package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckUserController {
	@RequestMapping(value = "/checkUser")
	public String checkUser(@RequestParam(name = "userName", required = true) String userName,
							@RequestParam(name = "password", required = true) String password) {
		if (userName.equals("sa") && password.equals("12345")) {
			return "ok";
		} else {
			return "error";
		}
	}
}