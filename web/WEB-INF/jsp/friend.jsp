<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>友链管理</title>
        <link rel="stylesheet" type="text/css" href="../../css/friend.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>友链管理</span></div>
    		<div id="div3">
	    		<table width="100%" cellpadding="0" cellspacing="0">
					<tr>
						<td id="td" style="width: 30%;">链接名称</td>
						<td id="td" style="width: 30%;">链接地址</td>
						<td id="td">操作</td>
					</tr>
					<c:forEach items="${list}" var="friendList">
						<tr height="38">
							<td id="td1" style="color: #797979;">${friendList.linkName}</td>
							<td id="td1"><a href="${friendList.linkPath}">${friendList.linkPath}</a></td>
							<td id="td1">
								<a href="/friendLink/updateFriendLink?id=${friendList.id}&uId=${loginUser.id}">
									<input type="button" value="修改"/>
								</a>
								<a href="/friendLink/deleteFriendLink?id=${friendList.id}&uId=${loginUser.id}">
									<input type="button" value="删除" style="background-color: #f05f5c;"/>
								</a>
							</td>
						</tr>
					</c:forEach>
	    		</table>
	    	</div>
	    	<div id="div4">
	    		<p><br />&nbsp;&nbsp;&nbsp;保存友链</p>
	    		<form action="/friendLink/insertFriendLink?userId=${loginUser.id}" method="post">
	    			<table width="100%">
	    			<tr>
	    				<td colspan="3" style="padding-top: 17px;padding-left: 17px;">
	    					<input type="text" placeholder="  请输入链接名称" name="linkName" style="height: 20px;"/>
		    				<input type="text" placeholder="  请输入链接地址" name="linkPath" style="height: 20px;"/>
		    				<input type="submit" value="保存链接" style="color: #fff;width: 80px;height: 25px;background-color: #41bd76;border: 0;"/>
	    				</td>
	    			</tr>
	    		</table>
	    		</form>
	    	</div>
    	</div>
 	</body>
</html>