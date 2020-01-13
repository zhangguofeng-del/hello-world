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
        <title>注册页面</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css"/>
        <script src="${pageContext.request.contextPath}/js/register.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body background="${pageContext.request.contextPath}/jpg/07.png">
    	<form action="/user/doRegister" method="post" onsubmit="return check()">
    		<table width="650px" height="350px" style="margin: 50px auto;" border="0" background="${pageContext.request.contextPath}/jpg/lan.gif">
    			<thead>
    				<th colspan="3" style="color: white;">Tale博客用户注册</th>
    			</thead>
    			<tbody>
    				<tr>
    					<td id="td1">用&nbsp;户&nbsp;名&nbsp;</td>
    					<td id="td2"><input type="text" id="name" name="name" title="用户名" placeholder="输入用户名" onmouseover="fos()" onmouseout="fos()"></td>
    					<td><span id="span1">*用户名不能为空</span></td>
    				</tr>
    				<tr>
    					<td id="td1">邮&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;</td>
    					<td id="td2"><input type="text" id="mail" name="mail" title="邮箱" placeholder="输入邮箱"/></td>
    					<td></td>
    				</tr>
    				<tr>
    					<td id="td1">密&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;</td>
    					<td id="td2"><input type="password" id="password1" name="password" title="密码" placeholder="输入密码" onmouseover="fos()" onmouseout="fos()"></td>
    				    <td><span id="span2">*密码不能为空</span></td>
    				</tr>
    				<tr>
    					<td id="td1">确认密码&nbsp;</td>
    					<td id="td2"><input type="password" id="password2" name="password2" title="确认密码" placeholder="确认密码" onmouseover="fos()" onmouseout="fos()"></td>
    					<td><span id="span3">*确认密码与密码不一致</span></td>
    				</tr>
    				<tr>
    					<td colspan="3">
    						<input type="submit" value="提交"  onclick="check()"/>
    						<input type="reset" value="清空"/>
    					</td>
    				</tr>
    			</tbody>
    		</table>
    	</form>
 	</body>
</html>