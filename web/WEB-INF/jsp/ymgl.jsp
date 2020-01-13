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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>页面管理</title>
        <link rel="stylesheet" type="text/css" href="../../css/ymgl.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>页面管理</span><a href="#" id="a1"><img src="../../jpg/ymfb.gif"/></a></div>
    		<div id="div3">	
	    		<table width="80%" cellpadding="0" cellspacing="0">
	    			<tr>
	    				<td id="td" style="width: 15%;">页面名称</td>
					    <td id="td" style="width: 15%;">页面路径</td>
					    <td id="td" style="width: 30%;">发布时间</td>
					    <td id="td" style="width: 11.3%;">发布状态</td>
					    <td id="td">操作</td>
	    			</tr>
					<tr height="38">
					    <td id="td1">a</td>
					    <td id="td1">1</td>
					    <td id="td1">1</td>
					    <td id="td1">已发布</td>
					    <td id="td1">
					    	<a href="#">
					    		<input type="button" value="编辑"/>
					    	</a>
					    	<a href="#">
					    		<input type="button" value="删除" style="background-color: #f05f5c;"/>
					    	</a>
					    	<a href="#">
					    		<input type="button" value="预览" style="background-color: #ffd94d;color: black;"/>
					    	</a>
					    </td>
					</tr>   
	    		</table>
	    	</div>
    	</div>
 	</body>
</html>