package com.tutorial.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @Autowired
  LoginService service;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLoginPage() {
    return "Login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
    boolean isUserValid = service.validateUser(name, password);

    if(!isUserValid) {
      model.put("errorMessage", "Invalid credentials");
      return "Login";
    }

    model.put("name", name);
    model.put("password", password);

    return "welcome";
  }
}
