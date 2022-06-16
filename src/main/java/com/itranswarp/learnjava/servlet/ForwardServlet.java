package com.itranswarp.learnjava.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;



@WebServlet(urlPatterns = "/morning")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        req.getRequestDispatcher("/hello").forward(req,resp);
    }

}
