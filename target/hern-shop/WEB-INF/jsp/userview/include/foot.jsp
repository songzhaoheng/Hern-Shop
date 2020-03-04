<!--前台用户页面底部-->
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hern电子商城</title>
    <link rel="Bookmark" href="resources/logo/Logo.jpg" />
    <link rel="shortcut icon" href="resources/logo/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="favicon.ico" type="image/x-icon" />
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">
    <script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
    <!-- 尾部 -->
    <hr/>
    <div class="foot-style">
      	Copyright © 2019 - 2020  HernSong.com 版权所有|消费者维权热线：12315经营证照
        <br/>
        	Hern电子商城
    </div>
    <!-- 结束啦 -->

</body>
</html>