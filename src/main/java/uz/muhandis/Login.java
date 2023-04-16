package uz.muhandis;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println("Login=" + login + " " + "Password=" + password);
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        printWriter.write("<h1>Hush kelibsiz hurmatli " + login + "</h1>");

    }

}
