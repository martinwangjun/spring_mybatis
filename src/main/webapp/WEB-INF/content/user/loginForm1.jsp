<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSP HTML5</title>
<link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h3>测试Model</h3>
<form action="login1" method="post">
     <table>
         <tr>
            <td><label>登录名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
            <td><label>密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
             <td><input id="submit" type="submit" value="登录"></td>
         </tr>
     </table>
</form>
</div>
</body>
</html>