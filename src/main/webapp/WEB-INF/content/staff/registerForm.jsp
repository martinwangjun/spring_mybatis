<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form  method="post" action="register" >
    <table class="table">
        <tr>
            <td>姓名:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" class="btn btn-primary"></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>