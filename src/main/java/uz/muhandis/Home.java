package uz.muhandis;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        printWriter.write("<h1>Muhangis.uzga hush kelibsiz!</h1>");
        printWriter.write("<a href='/login'>Tizimga kirish</a>");
    }
}
