package com.itranswarp.learnjava.servlet;


import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;


@WebServlet
public class LanguageServlet extends HttpServlet {

    private static final Set<String> LANGUAGES = Set.of("en","zh");

    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String lang = req.getParameter("lang");
        if (LANGUAGES.contains(lang)){
            Cookie cookie = new Cookie("lang",lang);
            cookie.setPath("/");
            cookie.setMaxAge(8640000);  // 100 days
            resp.addCookie(cookie);
        }
        resp.sendRedirect("/");
    }
}
