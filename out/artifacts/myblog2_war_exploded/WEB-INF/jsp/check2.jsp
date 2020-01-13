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
<body background="${pageContext.request.contextPath}/jpg/07.png">
    <table width="650px" height="350px" style="margin: 50px auto;" border="0" background="${pageContext.request.contextPath}/jpg/lan.gif">
        <thead>
        <th colspan="3" style="color: white;">Tale博客用户注册</th>
        </thead>
        <tbody>
        <tr>
            <td style="text-align: right;
                       padding-left: 50px;
                       color: darkblue;">
                用&nbsp;户&nbsp;名&nbsp;
            </td>
            <td style="text-align: left;
                       padding-left: 10px;
                       padding-top: 9px;"><input type="text" id="name" name="name" title="用户名" placeholder="输入用户名"></td>
            <td><span style="color: darkred;
                             font-size: 10px;
                             font-family: 微软雅黑;
                             display: none;">
                *用户名不能为空</span>
            </td>
        </tr>
        <tr>
            <td style="text-align: right;
                       padding-left: 50px;
                       color: darkblue;">邮&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;</td>
            <td style="text-align: left;
                       padding-left: 10px;
                       padding-top: 9px;">
                <input type="text" id="mail" name="mail" title="邮箱" placeholder="输入邮箱"/></td>
            <td></td>
        </tr>
        <tr>
            <td style="text-align: right;
                       padding-left: 50px;
                       color: darkblue;">密&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;</td>
            <td style="text-align: left;
                       padding-left: 10px;
                       padding-top: 9px;">
                <input type="password" id="password1" name="password1" title="密码" placeholder="输入密码"></td>
            <td><span style="color: darkred;
                             font-size: 10px;
                             font-family: 微软雅黑;
                             display: none;">
                *密码不能为空</span>
            </td>
        </tr>
        <tr>
            <td style="text-align: right;
                       padding-left: 50px;
                       color: darkblue;">确认密码&nbsp;</td>
            <td style="text-align: left;
                       padding-left: 10px;
                       padding-top: 9px;">
                <input type="password" id="password2" name="password2" title="确认密码" placeholder="确认密码"></td>
            <td><span style="color: darkred;
                font-size: 10px;
                font-family: 微软雅黑;
                display: none;">
                *确认密码与密码不一致</span>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="提交"  onclick="check()" style="width: 70px;
                        height: 40px;
                        background-color: #7894da;
                        border-radius: 7px;
                        color: white;
                        font-size: 15px;
                        position: relative;
                        left: 250px;"/>
                <input type="reset" value="清空" style="width: 70px;
                        height: 40px;
                        background-color: #7894da;
                        border-radius: 7px;
                        color: white;
                        font-size: 15px;
                        position: relative;
                        left: 250px;"/>/>
            </td>
        </tr>
        </tbody>
    </table>
    <div  style="width: 350px;
    height: 70px;
    background-color: rgba(0,0,1,0.3);
    position: absolute;
    left: 40%;
    top: 28%;
    border-radius: 20px;
    text-align: left;
    padding-top: 10px;
    color: white;
    font-family: 微软雅黑;
     visibility: visible">
        <br />&nbsp;注册成功,将在<font size="4" color="#8B0000"><span id="sp" style="width: 20px;height: 20px">3</span></font>秒后自动跳转到登录页面
    </div>
</body>
</html>
