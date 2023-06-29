<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>엽기떡볶이 키오스크</title>
</head>
<body>
        <!--
        사용자 이름 :
        떡볶이 종류 선택 1. 일반 떡볶이, 2. 로제 떡볶이, 3. 짜장 떡볶이
        떡볶이 맵기 선택 : 1. 일반, 2. 중간, 3. 매움
        토핑 선택 : 1. 중국당면, 2. 바싹치즈만두, 3. 김말이, 4. 주먹밥
        주문지 주소 :

        -->
        <h1><%= "엽기떢볶이 주문!" %></h1>
        <br/>
        <form action="delevery" method="post">

          <label>주문자명: </label> <input type="text" name="name"/>
            <br><hr>

            <label for="kind">떡볶이 종류 선택 : </label>
            <select name="kind" id="kind">
                <option value="일반">일반떡볶이</option>
                <option value="로제">로제떡볶이</option>
                <option value="짜장">짜장떡볶이</option>
            </select>
            <br>
            <hr>

            <label for="spicy">떡볶이 맵기 선택 : </label>
            <select name="spicy" id="spicy">
                <option value="일반">일반</option>
                <option value="중간맛">중간</option>
                <option value="매움">매움</option>
            </select>
            <br>
            <hr>


            <label for="topping">토핑 선택 : </label>
            <select name="topping" id="topping">
                <option value="중국당면">중국당면</option>
                <option value="바싹치즈만두">바싹치즈만두</option>
                <option value="김말이">김말이</option>
                <option value="주먹밥">주먹밥</option>
            </select>
            <br>
            <hr>

            <label>주소지 입력 : </label><input type="text" name="addr"/>
            <br><hr>

            <input type="submit" value="주문">
        </form>

            <!--치킨 영역-->
        <ul>
            <li><a href="chickin"> 치킨 주문 </a></li>
        </ul>






</body>
</html>