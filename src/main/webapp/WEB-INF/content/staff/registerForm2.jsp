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
<h1 class="text-center">测试form标签</h1>
<p>这里的modelAttribute的值"staff"就是源代码中：model.addAttribute("staff", staff)在引号中的staff</p>
<form:form modelAttribute="staff" method="post" action="register2" class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-10">
            <form:input path="name" cssClass="form-control" required="true" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">性别</label>
        <div class="col-sm-10">
            <form:input path="sex" cssClass="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">年龄</label>
        <div class="col-sm-10">
            <form:input path="age" cssClass="form-control" />
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