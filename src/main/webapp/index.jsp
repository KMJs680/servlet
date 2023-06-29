<%--
  Created by IntelliJ IDEA.
  User: seaya
  Date: 2023-06-30
  Time: 오전 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        .login-wrapper{
            width: 400px;
            height: 350px;
            padding: 40px;
            box-sizing: border-box;
            margin: auto;
        }

        .login-wrapper > h2{
            font-size: 24px;
            color: #6A24FE;
            margin-bottom: 20px;
        }
        #login-form > input{
            width: 100%;
            height: 48px;
            padding: 0 10px;
            box-sizing: border-box;
            margin-bottom: 16px;
            border-radius: 6px;
            background-color: #F8F8F8;
        }
        #login-form > input::placeholder{
            color: #6A24FE;
        }
        #login-form > input[type="submit"]{
            color: #fffdfd;
            font-size: 16px;
            background-color: #1a0c2f;
            margin-top: 20px;
        }
        h1{
            width: 350px;
            height: 150px;
            padding: 40px;
            box-sizing: border-box;
            margin: auto;
            color: #1a0c2f;
            font-size: 40px;
            background-color: #1a0c2f;
            margin-top: 20px;
            text-align: center;
            color: #F8F8F8;
            border-radius: 6px;

        }
    </style>
</head>
<body>

    <h1>비회원 주문</h1>
    <div class="login-wrapper">
        <form  action="member" method="post" id="login-form">
            <input type="text" name="userName" placeholder="주문자명">
            <input type="password" name="Password" placeholder="Password">
            <input type="tel" name="phone" placeholder="전화번호">
            <input type="text" name="addr" placeholder="주소입력">
            <input type="submit" value="입력완료">
        </form>
    </div>

</body>
</html>