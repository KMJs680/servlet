package com.example.orders;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/oder")
public class Order extends HttpServlet {
    private String messege;

    public Order() {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        messege = "커피 주문이 완료되었습니다. ";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getCharacterEncoding());
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        System.out.println("name : " + name);

        Map<String, String[]> reqMap = req.getParameterMap();
        Set<String> keySet = reqMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] valStrings = reqMap.get(key);

            System.out.println("key : " + key);
            for (int i = 0; i < valStrings.length; i++) {
                System.out.println("value[" + i + "] : " + valStrings[i]);
            }

            Enumeration<String> names = req.getParameterNames();
            while (names.hasMoreElements()){
                System.out.println(names.nextElement());
            }
            System.out.println("post 처리");
        }
            resp.setContentType("text/html");


            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + messege + "</h1>");
            out.println("</body></html>");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;

        String httpMethod = httpServletRequest.getMethod();
        System.out.println("http method : " +  httpMethod);

        if(("GET").equals(httpMethod)) {
            doGet(httpServletRequest, httpServletResponse);
        }else if(("POST").equals(httpMethod)){
            doPost(httpServletRequest, httpServletResponse);
        }
    }

    @Override
    public void destroy() {

    }


}
