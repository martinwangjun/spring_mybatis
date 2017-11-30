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
<h1 class="text-center">Welcome</h1>
<p>姓名：${requestScope.staff.name}</p>
<p>性别：${requestScope.staff.sex}</p>
<p>年龄：${requestScope.staff.age}</p>
<p>是否领导：${requestScope.staff.isLeader}</p>
<p>
${requestScope.staff.skills}
</p>
<p>
${requestScope.staff.departments}
</p>
</div>
</body>
</html>