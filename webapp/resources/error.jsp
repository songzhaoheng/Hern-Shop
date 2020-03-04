<%--
  Created by IntelliJ IDEA.
  User: 23369
  Date: 2020/2/21
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hern电子商城</title>
    <link rel="Bookmark" href="resources/logo/Logo.jpg" />
    <link rel="shortcut icon" href="resources/logo/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="favicon.ico" type="image/x-icon" />
    <link href="resources/css/style.css" rel="stylesheet">
    <link href="resources/css/layui.css" rel="stylesheet">
    <link href="resources/css/admin.css" rel="stylesheet">
    <script src="resources/js/jquery.min.js" type="text/javascript"></script>
    <script src="resources/js/layui.js" type="text/javascript"></script>

</head>
<body>
    <div class="layui-body" style="position:absolute;left:0px;" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show">
            <div class="layui-fluid" style="padding-top:60px;">
                <div class="layadmin-tips">
                    <i class="layui-icon" face=""></i>
                    <div class="layui-text" style="font-size: 20px;">好像出错了呢</div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
