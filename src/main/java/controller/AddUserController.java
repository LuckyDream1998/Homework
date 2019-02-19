package controller;

import model.ListUser;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUserController", urlPatterns = {"/addUser"})
public class AddUserController extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      String number = req.getParameter("number");
      String typeOfNumber = req.getParameter("typeOfNumber");
      String gender = req.getParameter("gender");
      String name = req.getParameter("name");
      String surName = req.getParameter("surName");
      int age = Integer.parseInt(req.getParameter("age"));
      User user = new User(name, surName, age, gender, typeOfNumber, number);
      ListUser listUser = ListUser.getInstance();
      listUser.add(user);
      req.setAttribute("message","User successfully saved");
    }catch (NullPointerException e) {
      req.setAttribute("message", "ERROR: User's surname already exist!");
    } finally {
      req.getRequestDispatcher("addUserPage.jsp").forward(req, resp);
    }
  }
}
