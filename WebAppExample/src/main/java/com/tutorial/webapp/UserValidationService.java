package com.tutorial.webapp;

public class UserValidationService {
  public boolean isUserValid(String user, String password) {
    if(user.equals("userName") && password.equals("dummyPassword"))
      return true;
    return false;
  }
}
