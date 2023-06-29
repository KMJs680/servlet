package com.example.section01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class ChickinRedirect extends HttpServlet {
    public ChickinRedirect() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("진격의 치킨 redirect 성공!");
        StringBuilder redirectText = new StringBuilder();
        redirectText.append("<!DOCTYPE html> \n")
                .append("<html lang=\"en\"> \n")
                .append("<head>\n")
                .append("<title>redirect</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append(" <h1>하지만 지금은 치킨을 시킬 수 없습니다.</h1> \n")
                .append("\n")
                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(redirectText.toString());
        out.flush();
        out.close();
    }
}
