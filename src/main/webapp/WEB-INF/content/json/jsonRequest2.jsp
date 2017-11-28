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
<script type="text/javascript">
$(document).ready(function(){
    $.ajax({
        url: "${pageContext.request.contextPath}/json/testRequestBody2",
        dataType: "json",
        type: "post",
        contentType:"application/json",
        data:JSON.stringify({name: '得到'}),
        success: function(data){
            console.log(data);
            $('#id').html(data.id);
            $('#name').html(data.name);
            $('#author').html(data.author);
        },
        error: function(){
            alert("数据发送失败");
        }
    });
});
</script>
编号：<span id="id"></span><br>
书名：<span id="name"></span><br>
作者：<span id="author"></span><br>
</div>
</body>
</html>