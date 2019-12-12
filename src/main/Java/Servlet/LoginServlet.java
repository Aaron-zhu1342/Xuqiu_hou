package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = request.getParameter("username");
       String password = request.getParameter("password");
        System.out.println(username+password);
//        super   second  teacher   student
       if(username.equals("super")&&password.equals("1111")) {
           request.setAttribute("user", username);
           response.sendRedirect("super_admin.html");
       }
       else if(username.equals("second")&&password.equals("1111")) {
           request.setAttribute("user",username);
           response.sendRedirect("second_admin.html");
       }
       else  if(username.equals("student")&&password.equals("1111")) {
           request.setAttribute("user", username);
           response.sendRedirect("student.html");
       }
       else if(username.equals("teacher")&&password.equals("1111")) {
           request.setAttribute("user",username);
           response.sendRedirect("teacher.html");
       }
       else
           response.sendRedirect("login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
