<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>떡볶이</title>
</head>
<body>
<h1>떡볶이</h1>
<h3>떡볶이에 오신것을 환영합니다!</h3>

<form action="order" method="get">
    <label>주문자</label> <input type="text" name="name"> <br>
    <br>
    <label>떡볶이종류선택 :</label> <br>
    <input type="radio" name="ricecakename" value="일반떡볶이"><label>일반떡볶이</label><br>
    <input type="radio" name="ricecakename" value="로제떡볶이"><label>로제떡볶이</label> <br>
    <input type="radio" name="ricecakename" value="짜장떡볶이"><label>짜장떡볶이</label> <br>
    <br>
    <label>맵기선택 : </label><br>
    <input type="radio" name="HOT" value="일반"><label>일반</label><br>
    <input type="radio" name="HOT" value="중간배움"><label>중간배움</label><br>
    <input type="radio" name="HOT" value="졸매움"><label>졸매움</label><br>
    <br>
    <%--    <label>토끼떡볶이</label>--%>

    <label>토핑선택 : </label><br>
    <select name="choice">
        <option value="중국당면">중국당면</option>
        <option value="바삭치즈만두">바삭치즈만두</option>
        <option value="김말이">김말이</option>
        <option value="주먹밥">주먹밥</option>
        <option value="아무거나">아무거나</option>
    </select>
    <br>
    <br>
    <input type="checkbox" name="hobbies" value="movie"> <label>토끼떡볶이</label>
    <input type="submit" value="주문하기">
    <br>
    <br>
    <label> 주소지 입력 </label><input type="text" name="addr"/>
    <br>
</form>
<br>

<form action="/ChickinOorder" method="get">

    <input type="checkbox" name="chickin" value="movie"> <label>토끼치킨</label>
    <input type="submit" value="주문하기">
</form>

<%--    <label>토끼치킨</label>--%>
</body>
</html>