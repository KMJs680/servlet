package com.example.xml.order;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class xmlOrder extends HttpServlet {


    private static final long serialVersionUID = 1L;

    /* 필기. 각 메소드의 호출 횟수를 카운트 할 목적의 필드 */
    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;
    private String messege;

    /* 필기. 기본 생성자 */
    public xmlOrder() {
    }

    /* 필기. 최초 서블릿 요청 시에 동작하는 메소드 */
    public void init(ServletConfig config) throws ServletException {
        /* 필기. 서블릿 컨테이너에 의해 호출되며 최초 요청 시에만 실행하고 두 번쨰 요청부터는 호출하지 않는다. */
        System.out.println("xml 매핑 init() 메소드 호출 : " + initCount++);
    }

    public void destroy() {
        /* 필기. 컨테이너가 종료될 때 호출되는 메소드이며 주로 자원을 반납하는 용도로 사용한다. */
        System.out.println("xml 매핑 destroy() 메소드 호출 : " + destroyCount++);
    }

    public void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        /* 필기. 서블릿 컨테이너에 의해 호출되며 최초 요청 시에는 init() 이후에 동작하고,
         *      두 번째 요청부터는 init() 호출 없이 바로 service()를 호출한다.
         * */
        System.out.println("xml 매핑 service() 메소드 호출 : " + serviceCount++);
        System.out.println(request.getCharacterEncoding());
        request.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        System.out.println("name : " + name);

        Map<String, String[]> reqMap = request.getParameterMap();
        Set<String> keySet = reqMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] valStrings = reqMap.get(key);

            System.out.println("key : " + key);
            for (int i = 0; i < valStrings.length; i++) {
                System.out.println("value[" + i + "] : " + valStrings[i]);
            }

            Enumeration<String> names = request.getParameterNames();
            while (names.hasMoreElements()){
                System.out.println(names.nextElement());
            }
            System.out.println("get 처리");
        }
        resp.setContentType("text/html");


        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + messege + "</h1>");
        out.println("</body></html>");


    }


}

