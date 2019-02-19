package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MessageServlet", urlPatterns = {"/message"})
public class MessageServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String message = '"' + req.getParameter("message") + '"';
    req.setAttribute("message", message);
    req.getRequestDispatcher("secondHomework.jsp").forward(req,resp);
  }
}
