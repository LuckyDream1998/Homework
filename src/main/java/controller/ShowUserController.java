package controller;

import model.ListUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowUserController", urlPatterns = {"/showUser"})
public class ShowUserController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    ListUser listUser = ListUser.getInstance();
    req.setAttribute("userList", listUser.list());
    req.getRequestDispatcher("thirdHomework.jsp").forward(req, resp);
  }
}
