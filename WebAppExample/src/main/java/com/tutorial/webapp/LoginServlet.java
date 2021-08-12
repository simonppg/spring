package com.tutorial.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String name = req.getParameter("name");
    System.out.println(name);
    req.setAttribute("name" , name);
    req.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(req, res);
  }
}
