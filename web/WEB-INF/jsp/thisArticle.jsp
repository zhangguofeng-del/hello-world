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
        <title>#</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/this_article.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="header">
    			<img src="../../jpg/logo.gif"/>
    			<span>Tale Blog</span>
    			<form action="#" method="get">
    				<input type="text" name="checkArticle" readonly = "readonly" placeholder="  请输入标题搜索关键字"/>
    				<input type="submit" value="" onclick="play()"/>
    			</form>
				<a href="/beforePage/selectFriendLink" style="position: absolute;top: 20px;left: 1150px;background-color: #FFFFFF;text-decoration: none;color: #353535;">[友链]</a>
				<a href="/beforePage/selectAllBooks" style="position: absolute;top: 20px;left: 1200px;background-color: #FFFFFF;text-decoration: none;color: #353535;">[文章]</a>
				<a href="/user/login" id="a1" style="position: absolute;top: 20px;left: 1250px;text-decoration: none;color: #2e343f">[注销]</a>
    		</div>
    		<div id="content">
    			<div id="date"><p>标题：<font color="#353535;">${book.title}</font></p></div>
    			<p style="width: 90%">发布于&nbsp;${book.createtime}&nbsp;/&nbsp;#条品论&nbsp;/&nbsp;${book.pageview}&nbsp;次浏览&nbsp;</p>
    			<hr style="position: relative;top: -75px;"/>
    			<p style="position: relative;top: -70px">${book.words}</p>
    		</div>
    		<div id="bottom">
    			<form action="/beforePage/insertGuest?id=${loginUser.id}&targetId=${book.user.id}" method="post">
    				<table>
    				<tr>
    					<td>姓名(*)  <input type="text" name="guestUserName" value="${loginUser.name}" readonly="readonly"/></td>
    					<td>邮箱(mail)  <input type="text" name="guestUserMail" value="${loginUser.mail}" readonly="readonly"/></td>
    				</tr>
    				<tr>
    					<td colspan="2">
    						<textarea name="guest" rows="8" cols="75" placeholder="元方,你怎么看.."></textarea>
    					</td>
    				</tr>
    				<tr>
    					<td colspan="2">
    						<input type="submit" value="提交" style="background-color: #e21a1e;color: #fff;width: 50px;height: 25px;float: right;"/>
    					</td>
    				</tr>
    			</table>
    			</form>
    			
    		</div>
    	</div>
 	</body>
</html>