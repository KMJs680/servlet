package com.example.section01;

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

@WebServlet("/yupgi")
public class YupgiTteokbokki extends HttpServlet {
    //index에서 들어오는 정보 입력
    public YupgiTteokbokki() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getCharacterEncoding());
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter("name");
        System.out.println("주문자명 : " + name);
        String addr = req.getParameter("addr");
        System.out.println("주소 : " + addr);
        String kind = req.getParameter("kind");
        System.out.println("떡볶이 종류 : " + kind);
        String spicy = req.getParameter("spicy");
        System.out.println("맵기 조절 : " + spicy);
        String topping = req.getParameter("topping");
        System.out.println("토핑 종류 : " + topping);



        Map<String, String[]> reqMap = req.getParameterMap();
        Set<String> keySet = reqMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] valStrings = reqMap.get(key);

            System.out.println("key : " + key);
            for(int i=0; i<valStrings.length;i++){
                System.out.println("value[" + i + "] : " + valStrings[i]);
            }

            Enumeration<String> names = req.getParameterNames();
            while (names.hasMoreElements()){
                System.out.println(names.nextElement());
            }
            System.out.println("post 처리");
        }
        resp.setContentType("text/html");

        //입력받은 값들을 다음 페이지로 넘겨줌
        StringBuilder responseText = new StringBuilder();
        responseText.append("<!DOCTYPE html> \n")
                .append("<html lang=\"en\"> \n")
                .append("<head> \n")
                .append("<title>주문확인</title>\n")
                .append("</head> \n")
                .append("<body>\n")
                .append("<h3 style=\"align-content: center;\">\n")
                .append(name + "님 주문 내역입니다. </h3>")
                .append("<br> 주소 : " + addr)
                .append("<br> 떡볶이 종류 : " + kind)
                .append("<br> 맵기 : " + spicy)
                .append("<br> 토핑 : " + topping)
                .append("<br><hr>\n")
                .append("<br> 배달원 : 김형통 입니다.")
                .append("</body> \n")
                .append("</html> \n");

        PrintWriter out = resp.getWriter();
        out.print(responseText.toString());
        out.flush();
        out.close();





    }


}
