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
<form id="form1" action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"><img src="" id="show_image"> <br>
    <input type="button" value="上传" onclick="upload()">
</form>

<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
    function upload() {
        //获取form表单
        var form = $("#form1")[0];
        //将HTML中的表单标签转换成js中的表单对象
        var formData=new FormData(form);

        $.ajax({
            url:"upload",
            method:"post",
            data:formData,
            contentType:false, //内容false才能上传file文件,配置false是为了清除默认文件格式，false表示无文件格式。
            processData:false,//false表示不将参数转换成字符串
            success:function(data){
                alert(data.code+"/"+data.data);
                $("#show_image").attr("src",data.data);
            }
        });
    }
</script>
</body>
</html>
