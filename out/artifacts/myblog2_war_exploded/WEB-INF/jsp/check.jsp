<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/5/18
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校验页面</title>
    <script type="text/javascript">
            onload = function(){
            setInterval(go,1000);
        };
            var x = 4;
            function go() {
                x--;
                if (x <= 0) {
                    location.href = "/user/login";
                }
                else {
                    document.getElementById("sp").innerHTML = x;
                }
            }
    </script>
</head>
<body>
<h1 align="center">用户不存在<font color="red"><span id="sp" style="width: 20px;height: 20px"></span></font>秒后返回登录页面</h1>
</body>
</html>
