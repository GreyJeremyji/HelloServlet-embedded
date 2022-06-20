package com.itranswarp.learnjava.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.ServletException;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/signout")
public class SignOutServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        req.getSession().removeAttribute("user");
        resp.sendRedirect("/");
    }

}
