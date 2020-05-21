package com.codecool.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "anotherTest", urlPatterns = {"/test"}, loadOnStartup = 3)
public class AnotherTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = "Vlad";

        out.println(
                "<html>\n" +
                        "<head><title>Another page</title></head>\n" +
                        "<body>\n" +
                        "<h1>Hello CodeCooler!</h1>" +
                        "<div>"+ name  +"</div>"+
                        "</body></html>"
        );
    }
}
