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
    // xml格式的字符串。
    var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><book2><id>1</id><name>疯狂Java讲义</name><author>李刚</author></book2>";
    $.ajax({
        url: "${pageContext.request.contextPath}/xml/sendxml",
        dataType : "json",
        type : "post",
        contentType:"application/xml",
        data:xmlData,
        success: function(data){
            console.log(data);
        },
        error:function(){
            alert("数据发送失败");
        }
    });
});
</script>
</div>
</body>
</html>