<%--
  Created by IntelliJ IDEA.
  User: yangjw
  Date: 2019/4/11
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
<!--上传只能用post，上传协议multipart/form-data -->
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"> <br>
    <input type="submit" value="上传">
</form>
</body>
</html>
