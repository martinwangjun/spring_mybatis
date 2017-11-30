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
<h1 class="text-center">用户注册</h1>
<form:form modelAttribute="user" method="post" action="register"  cssClass="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-10">
            <form:input path="username" cssClass="form-control" />
            <form:errors path="username" cssClass="help-block" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">账号</label>
        <div class="col-sm-10">
            <form:input path="loginname" cssClass="form-control" />
            <form:errors path="loginname" cssClass="help-block" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <form:input path="password" cssClass="form-control" />
            <form:errors path="password" cssClass="help-block" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-10 col-sm-offset-2">
            <input type="submit" class="btn btn-primary" value="注册">
        </div>
    </div>
</form:form>
</div>
</body>
</html>