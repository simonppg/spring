package com.tutorial.login;

public class LoginService {
  public boolean validateUser(String user, String password) {
    return user.equalsIgnoreCase("userName")
      && password.equals("dummyPassword");
  }
}
