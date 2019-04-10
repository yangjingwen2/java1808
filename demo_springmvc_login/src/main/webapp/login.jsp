<%--
  Created by IntelliJ IDEA.
  User: yangjw
  Date: 2019/4/9
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form method="post" action="user/login3">
    名称：<input type="text" id="username" name="username"><br/>
    密码：<input type="password" id="password" name="password"><br/>
    <input type="button" onclick="login()" value="login">
</form>

<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
    function login() {
       //获取用户输入的用户名和密码
        var usernameStr = $("#username").val();
        var passwordStr = $("#password").val();
        //将用户名和密码通过ajax提交到后台
        //参数1：URL，需要发送数据的后台地址
        //参数2：需要发送到指定URL的数据，只能是json数据
        //参数3：后台返回的数据，回调函数
        $.post("user/login3",
            {username:usernameStr,password:passwordStr},
            function (data) {

                if (data.code == 1) {
                    //登录成功
                    window.location.href="hello.jsp";
                } else {
                    alert("登录失败："+data.msg);
                }
            });

    }
</script>
</body>
</html>
