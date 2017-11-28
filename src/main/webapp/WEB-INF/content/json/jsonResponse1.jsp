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
<script type="text/javascript">
$(document).ready(function(){
    $.ajax({
        url: '${pageContext.request.contextPath}/json/testResponseBody1',
        dataType : "json",
        type : "post",
        contentType:"application/json",
        data:null,
        success: function(data){
            console.log(data);
            $.each(data, function(){
                var row  = $("<tr />");
                $("<td/>").html(this.id).appendTo(row);
                $("<td/>").html(this.name).appendTo(row);
                $("<td/>").html(this.author).appendTo(row);
                $("#booktable").append(row);
            });
        },
        error:function(){
            alert("数据发送失败");
        }
    });
});
</script>
<div class="container">
<table id="booktable" class="table">
    <tr>
      <th>编号</th>
      <th>书名</th>
      <th>作者</th>
    </tr>
    
</table>
</div>
</body>
</html>