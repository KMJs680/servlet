<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "음료를 주문하세요" %>
    </h1>
    <br/>

    <form action="oder" method="post">
        <label>음료를 선택 하세요</label>
        <br/>
        <label>음료선택</label>
        <input type="radio" name="coffee" id="americano" value="a"><label for="americano">아메리카노</label>
        <input type="radio" name="coffee" id="latte" value="l"><label for="latte">카페라떼</label>
        <input type="radio" name="coffee" id="orangejuice" value="o"><label for="orangejuice">오렌지주스</label>
        <input type="radio" name="coffee" id="strawberryjuice" value="s"><label for="strawberryjuice">딸기주스</label>
        <br/>
        <label>주문일자 : </label><input type="date" name="orderday">
        <br/>
        <label>cool / hot : </label>
        <input type="radio" name="oders" id="ice" value="i"><label for="ice">차갑게</label>
        <input type="radio" name="oders" id="hot" value="h"><label for="hot">뜨겁게</label>
        <br/>
        <hr>
        <input type="submit" value="음료주문">
    </form>

    <hr>

    <h1><%= "xml방식 음료를 주문하세요" %>
    </h1>
    <br/>
    <form action="/xml-lifecycle" method="get">
        <label>음료를 선택 하세요</label>
        <br/>
        <label>음료선택</label>
        <input type="radio" name="coffee" id="americano1" value="a"><label for="americano1">아메리카노</label>
        <input type="radio" name="coffee" id="latte1" value="l"><label for="latte">카페라떼</label>
        <input type="radio" name="coffee" id="orangejuice1" value="o"><label for="orangejuice1">오렌지주스</label>
        <input type="radio" name="coffee" id="strawberryjuice1" value="s"><label for="strawberryjuice1">딸기주스</label>
        <br/>
        <label>주문일자 : </label><input type="date" name="orderday">
        <br/>
        <label>cool / hot : </label>
        <input type="radio" name="oders" id="ice1" value="i"><label for="ice1">차갑게</label>
        <input type="radio" name="oders" id="hot1" value="h"><label for="hot1">뜨겁게</label>
        <br/>
        <hr>
        <input type="submit" value="음료주문">
    </form>


</body>
</html>