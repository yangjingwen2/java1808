<%--
  Created by IntelliJ IDEA.
  User: yangjw
  Date: 2019/4/9
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello SpringMVC! <shiro:hasPermission name="商品列表">千锋Java</shiro:hasPermission></h1>
</body>
</html>
