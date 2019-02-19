package controller;

import model.ListUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUserController", urlPatterns = {"/deleteUser"})
public class DeleteUserController extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String surName = req.getParameter("surName");
    ListUser listUser = ListUser.getInstance();
    listUser.delete(surName);
    req.setAttribute("userList", listUser.list());
    req.getRequestDispatcher("thirdHomework.jsp").forward(req, resp);
  }
}
