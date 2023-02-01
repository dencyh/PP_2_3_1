package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String getUserList(ModelMap model) {
		model.addAttribute("users", userService.getAll());
		return "index";
	}

	@GetMapping(value = "/users/new")
	public String showNewForm(Model model) {
		User user = new User();
		try {
			user.setBirthDate(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01").getTime()));
		} catch (ParseException ignored) {
		}
		model.addAttribute("newUser", user);
		return "new";
	}

	@PostMapping(value = "/users")
	public String addNewUser(@ModelAttribute User user) {
		userService.add(user);
		return "redirect:/";
	}

	@DeleteMapping(value ="/users/{id}")
	public String deleteUser(@PathVariable long id) {
		userService.deleteById(id);
		return "redirect:/";
	}

}