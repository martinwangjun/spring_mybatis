<%@page import="pojo.User"%>
<%@page import="java.util.ArrayList"%>
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
<form action="list" method="post">
     <table>
         <tr>
            <td><label>登录名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
            <td><label>密码: </label></td>
             <td><input type="password" id="password" name="password"></td>
         </tr>
         <tr>
            <td><label>真实姓名: </label></td>
             <td><input type="text" id="username" name="username" ></td>
         </tr>
         <tr>
             <td><input id="submit" type="submit" value="注册"></td>
         </tr>
     </table>
</form>
<%
if(request.getAttribute("userList") != null){
    ArrayList<User> userList= (ArrayList<User>)request.getAttribute("userList");
    for(User user: userList){
        out.write("<p>" + user.getUsername() + "</p>");
    }
}
%>
</div>
</body>
</html>