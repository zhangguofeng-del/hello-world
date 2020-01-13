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
        <title>Tale博客前台</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/tale_blog.css"/>
		<style>
			.div0 a:hover{
				font-size: 30px;
			}
		</style>
    </head>
    <body>
    	<div id="div1">
    		<div id="header">
    			<img src="../../jpg/logo.gif"/>
    			<span>Tale Blog</span>
    			<form action="/beforePage/selectBookTitle" method="post">
    				<input type="text" name="checkArticle" placeholder="  请输入标题搜索关键字"/>
    				<input type="submit" value="" style="background-image: url('../../jpg/fdj.gif')"/>
    			</form>
    			<a href="/beforePage/selectFriendLink" style="position: absolute;top: 20px;left: 1150px;background-color: #FFFFFF;text-decoration: none;color: #353535;">[友链]</a>
    			<a href="/beforePage/selectAllBooks" style="position: absolute;top: 20px;left: 1200px;background-color: #FFFFFF;text-decoration: none;color: #353535;">[文章]</a>
    			<a href="/user/login" id="a1" style="position: absolute;top: 20px;left: 1250px;text-decoration: none;color: #2e343f">[注销]</a>
    		</div>
    		<div style="width: 85%;height: 80%;background-color: #f7f7f7;margin-left: 100px">
    			<div style="width: 200px;height: 45px;margin-left: 18%;padding-top: 25px;"><font color="#6C8AD9">#tale</font>&nbsp;</div>
				<c:forEach items="${pageBean.getPageData()}" var="bookList">
					<div class="div0" style="background-image: url(../../jpg/ft2.gif);background-repeat: no-repeat;width: 268px;height: 92px;position: relative;left: 15%;top: 10px;margin-right: 50px;margin-bottom: 50px;background-color: #fff;float: left;">
						<span style="font-size: 20px;position: relative;left: 88px;top: 8px;">
							<a href="/beforePage/showBook?id=${bookList.id}" style="text-decoration: none;color: #313131;">
									${bookList.title}
							</a>
						</span><br>
						<span style="color: #5f5f5f;font-size: 10px;position: relative;top: 20px;left: 88px">发布于${bookList.createtime}</span>
					</div>
				</c:forEach>
							<div style="width: 500px;height: 30px;margin-top: 400px;margin-left: 35%">
								当前第${pageBean.getCurrentPage()}页
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a style="text-decoration: none" href="/beforePage/selectAllBooks?currentPage=1&id=${user.id}">首页</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<a style="text-decoration: none" href="/beforePage/selectAllBooks?currentPage=${pageBean.getCurrentPage()-1}&id=${user.id}"><-- </a>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共${pageBean.getTotalPage()}页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a style="text-decoration: none" href="/beforePage/selectAllBooks?currentPage=${pageBean.getCurrentPage()+1}&id=${user.id}">--> </a>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<a style="text-decoration: none" href="/beforePage/selectAllBooks?currentPage=${pageBean.getTotalPage()}&id=${user.id}">末页</a>
							</div>
    		</div>
		</div>
 	</body>
</html>