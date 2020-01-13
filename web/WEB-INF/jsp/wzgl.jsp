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
        <title>文章管理</title>
        <link rel="stylesheet" type="text/css" href="../../css/wzgl.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>文章管理</span></div>
    		<div id="div3" style="height: 400px">
	    		<table width="100%" cellpadding="0" cellspacing="0">
	    			<tr>
	    				<td id="td" style="width: 35%;">文章标题</td>
					    <td id="td" style="width: 15%;">发布时间</td>
					    <td id="td" style="width: 7.5%;">浏览量</td>
					    <td id="td" style="width: 9.3%;">所属分类</td>
					    <td id="td" style="width: 8%;">发布状态</td>
					    <td id="td">操作</td>
	    			</tr>
					<c:forEach items="${pageBean.getPageData()}" var="bookList">
						<tr height="38">
							<td id="td1">${bookList.title}</td>
							<td id="td1" style="color: #797979;">${bookList.createtime}</td>
							<td id="td1" style="color: #797979;">${bookList.pageview}</td>
							<td id="td1" style="color: #797979;">${bookList.classify}</td>
							<td id="td1"><img src="../../jpg/yfb.gif"/></td>
							<td id="td1">
								<a href="/bookManage/updateBook?id=${bookList.id}&uId=${loginUser.id}">
									<input type="button" value="编辑"/>
								</a>
								<a href="/bookManage/deleteBook?id=${bookList.id}&uId=${loginUser.id}">
									<input type="button" value="删除" style="background-color: #f05f5c;"/>
								</a>
								<a href="/bookManage/yuLan?id=${bookList.id}&uId=${loginUser.id}">
									<input type="button" value="预览" style="background-color: #ffd94d;color: black;"/>
								</a>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="7" align="center">
							当前${pageBean.getCurrentPage()}/${pageBean.getTotalPage()}页 &nbsp;&nbsp;
							<a href="/bookManage/showAllBook?currentPage=1&id=${loginUser.id}">首页</a>
							<a href="/bookManage/showAllBook?currentPage=${pageBean.getCurrentPage()-1}&id=${loginUser.id}">上一页 </a>
							<a href="/bookManage/showAllBook?currentPage=${pageBean.getCurrentPage()+1}&id=${loginUser.id}">下一页 </a>
							<a href="/bookManage/showAllBook?currentPage=${pageBean.getTotalPage()}&id=${loginUser.id}">末页</a>
						</td>
					</tr>
	    		</table>
	    	</div>
    	</div>
 	</body>
</html>