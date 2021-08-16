package com.tutorial.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
  private UserValidationService service = new UserValidationService();
  private String JSP_LOGIN= "/WEB-INF/views/Login.jsp";
  private String JSP_WELCOME= "/WEB-INF/views/welcome.jsp";

  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    redirectTo(req, res, JSP_LOGIN);
  }

  private void redirectTo(HttpServletRequest req, HttpServletResponse res, String jspPath)
      throws ServletException, IOException {
      req.getRequestDispatcher(jspPath).forward(req, res);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String userName = req.getParameter("name");
    String password = req.getParameter("password");

    boolean isUserValid = service.isUserValid(userName, password);

    if(!isUserValid) {
      req.setAttribute("errorMessage", "Invalid credentials");
      redirectTo(req, res, JSP_LOGIN);
      return;
    }

    req.setAttribute("name" ,userName);
    req.setAttribute("password" ,password);
    redirectTo(req, res, JSP_WELCOME);
  }
}
