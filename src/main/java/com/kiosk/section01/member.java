package com.kiosk.section01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member")
public class member extends HttpServlet {
    public member() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");


        String name = req.getParameter("userName");
        String pass = req.getParameter("Password");
        String phone = req.getParameter("phone");
        String addr = req.getParameter("addr");

        System.out.println(name);
        System.out.println(pass);
        System.out.println(phone);
        System.out.println(addr);

        System.out.println("비밀번호 : " + pass);
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("pass", pass);
        session.setAttribute("phone", phone );
        session.setAttribute("addr" , addr);

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println(name + "님 환영합니다.\n");
        out.println();
        out.println("<br><a href=oder>주문하러가기</a>");






    }
}
