package com.itranswarp.learnjava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.annotation.WebServlet;

@WebServlet
public class IndexServlet extends HttpServlet{



    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
        String user =(String) req.getSession().getAttribute("user");
        String lang = parseLanguagaFromCookie(req);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();
        if(lang.equals("zh")){
            pw.write("<h1>"+(user != null ? user : "Guest")+"</h1>");
            if(user == null){
                pw.write("<p><a href=\"/signin\" >denglu</a></p>");
            }else{
                pw.write("<p><a href = \"/signout\">dengchu</a></p>");
            }

        } else{
            pw.write("<h1>Welcome,"+(user!=null ? user: "Guest")+"</h1>");
            if(user == null){
                pw.write("<p><a href=\"/signin\" >Sign In</a></p>");
            }else{
                pw.write("<p><a href = \"/signout\">Sign out</a></p>");
            }

        }
        pw.write("<p><a href= \"/pref ? lang=en\">English</a> | <a href = \"/pref ? lang=zh\">中文</a>");
        pw.flush();

    }


    private String parseLanguagaFromCookie(HttpServletRequest req){
        Cookie[] cookies = req.getCookies();
        if (cookies != null){
            for(Cookie cookie:cookies){
                if (cookie.getName().equals("lang")){

                }
            }
        }
        return "en";
    }

}
