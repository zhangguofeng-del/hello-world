<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/5/16
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>登录页面</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css"/>
        <script src="${pageContext.request.contextPath}/js/login.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
	    <div id="div1">
		    <div id="div2">Tale &nbsp;博客</div>
		    <div id="div3">
		        <form action="/user/doLogin" method="post" onsubmit="return check()">
		            <table width="590px" style="padding-top: 50px;">
		                <tr>
		                    <!--<td id="td1">用户名</td>-->
		                    <td id="td1"><img src="${pageContext.request.contextPath}/jpg/yh.gif"/></td>
		                    <td id="td2"><input type="text" id="name" name="name" title="用户名" placeholder="请输入用户名"></td>
		                </tr>
		                <tr><td></td></tr>
		                <tr>
		                    <!--<td id="td1">密&nbsp;&nbsp;&nbsp;码</td>-->
		                    <td id="td1"><img src="${pageContext.request.contextPath}/jpg/suo.gif"/></td>
		                    <td id="td2"><input type="password" id="password" name="password" title="密码" placeholder="请输入密码"></td>
		                </tr>

		            </table>
		            <div id="div4">
		            	<a href="/user/register"><input type="button" name="" id="register" value="注册"/></a>
		            	<input type="submit" name="" value="登录"/>
		            	<input type="reset" value="清空"/>
		            </div>
		        </form>
   			</div>
		</div>
 	</body>
</html>