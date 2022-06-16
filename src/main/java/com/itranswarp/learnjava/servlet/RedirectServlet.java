package com.itranswarp.learnjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hi")
public class RedirectServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
        String name = req.getParameter("name");
        String redirectToUrl = "/hello"+(name == null ? "" : "?name=" + name);
        resp.sendRedirect(redirectToUrl);

    }
}
