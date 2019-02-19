package controller;

import model.ListUser;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateUserController", urlPatterns = {"/updateUser"})
public class UpdateUserController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("oldSurname", req.getParameter("oldSurname"));
    req.getRequestDispatcher("updateUserPage.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      int newAge = Integer.parseInt(req.getParameter("age"));
      User user = new User(req.getParameter("name"), req.getParameter("surName"), newAge ,
        req.getParameter("gender"), req.getParameter("typeOfNumber"), req.getParameter("number"));

      ListUser listUser = ListUser.getInstance();
      listUser.update(user, req.getParameter("oldSurname"));
      req.setAttribute("oldSurname", user.getSurName());
      req.setAttribute("message" , "User successfully updated");
    } catch (NullPointerException e) {
      req.setAttribute("oldSurname", req.getParameter("oldSurname"));
      req.setAttribute("message" , "ERROR: Surname already exist!");
    } finally {
      req.getRequestDispatcher("updateUserPage.jsp").forward(req, resp);
    }
  }
}
