package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
	private UserService userService = new UserServiceImpl();

	@GetMapping(value = "/")
	public String getUserList(ModelMap model) {

		List<User> list = userService.getAll();
		for (User u: list) {
			System.out.println(u);
		}

		model.addAttribute("users", userService.getAll());
		return "index";
	}

}