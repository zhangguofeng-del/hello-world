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
        <title>系统设置</title>
        <link rel="stylesheet" type="text/css" href="../../css/xtsz.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>系统设置</span></div>
    		<div id="div3"><br>
	    		<span>个人信息</span>
	    		<form action="/userSet/doUpateUser1?id=${loginUser.id}" method="post">
	    			<ul>
		    			<li>账号<input type="text" value="${user.name}" readonly = "readonly" placeholder="  请输入用户名" name="userName"/></li>
		    			<li>邮箱<input type="text" value="${user.mail}" placeholder="  请输入邮箱" name="userMail"/></li>
		    		</ul>
		    		<input type="submit" value="修改信息" style="background-color: #6e8cd7;"/>
					<div style="position: relative;
					top: -5px;left: 100px;
					color: #8763c6;
					width: 70px;height: 25px;padding: 5px 10px;">
						${check1}
					</div>
	    		</form>
	    	</div>
	    	<div id="div4"><br>
	    		<span>密码设置(下次请用新密码登录)</span>
	    		<form action="/userSet/doUpateUser2?id=${loginUser.id}" method="post">
	    			<ul>
		    			<li>旧密码<input type="text" placeholder="  请输入旧密码" name="userOldPassword"/></li>
		    			<li>新密码<input type="text" placeholder="  请输入新密码" name="userNewPassword"></li>
		    		</ul>
		    		<input type="submit" value="设置密码" style="background-color: #f05f5c;"/>
					<div style="position: relative;
					top: -5px;left: 100px;
					color: #8763c6;
					width: 70px;height: 25px;padding: 5px 10px;">
						${check2}
					</div>
	    		</form>
	    	</div>
	    	<div id="div5"><br>
	    		<span>全局设置</span>
	    		<form action="#" method="get">
	    			<ul>
		    			<li>站点名称<input type="text" value="张国锋的Tale博客站点" placeholder="  请输入站点名称" readonly="readonly"/></li>
		    			<li>站点描述<input type="text" placeholder="  请输入站点描述" readonly="readonly"/></li>
		    			<li>站点关键词<input type="text" placeholder="  请输入关键词" readonly="readonly"/></li>
		    			<li>博客主题<input type="text" value="学习交流" placeholder="  请输入主题" readonly="readonly"/></li>
		    		</ul>	
		    		<input type="submit" value="保存设置" style="background-color: #212121;"/>
	    		</form>	
	    	</div>
	    	
    	</div>
 	</body>
</html>