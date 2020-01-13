<%@ page import="com.colin.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/5/16
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Tale博客管理中心</title>
        <link rel="stylesheet" type="text/css" href="../../css/administration_center.css"/>
        <script src="../../js/administration_success.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2">
    			<img src="../../jpg/logo.gif"/>
    			<span id="sp1">Tale&nbsp;Blog</span>
    		</div>
    		<div id="div3">
    			<button style="width: 22px; height: 19px;" onclick="showUl();"><img src="../../jpg/qt.gif"/></button>
    			<span style="font-size: 10px;position: relative;top: 25%;left: 0.8%;">[<-前台页面]</span>
    			<ul id="ul1">
    				<li id="li11" onmouseover="a('li11');" onmouseout="b('li11');"><a href="/beforePage/selectAllBooks?id=${loginUser.id}">前台页面</a></li>
    				<li id="li22" onmouseover="a('li22');" onmouseout="b('li22');"><a href="#" onclick="alert('java mysql html')">后端技术</a></li>
    				<li id="li33" onmouseover="a('li33');" onmouseout="b('li33');"><a href="#" onclick="alert('张国锋')">合法人</a></li>
    			</ul>
    			<img src="../../jpg/g.gif" style="float: right;margin-right: 20px;margin-top: 10px;"/>
    		</div>
    		<div id="div4">
    			<ul id="ul2">
    				<li id="li1" onmouseover="c('1')" onmouseout="d('1')"><img src="../../jpg/t1.gif" id="i1"/><a href="/yiBiaoPan/selectData?id=${loginUser.id}" id="a1" target="iframe">仪表盘</a></li>
    				<li id="li2" onmouseover="c('2')" onmouseout="d('2')"><img src="../../jpg/t2.gif" id="i2"/><a href="/publishArticle/showData?id=${loginUser.id}" id="a2" target="iframe">发布文章</a></li>
    				<li id="li3" onmouseover="c('3')" onmouseout="d('3')"><img src="../../jpg/t3.gif" id="i3"/><a href="/bookManage/showAllBook?id=${loginUser.id}" id="a3" target="iframe">文章管理</a></li>
    				<%--<li id="li4" onmouseover="c('4')" onmouseout="d('4')"><img src="../jpg/t4.gif" id="i4"/><a href="/jsp/ymgl.jsp" id="a4" target="iframe">页面管理</a></li>--%>
    				<li id="li5" onmouseover="c('5')" onmouseout="d('5')"><img src="../../jpg/t5.gif" id="i5"/><a href="/classifyAndLabel/selectClassifyAndLabel?id=${loginUser.id}" id="a5" target="iframe">分类/标签</a></li>
    				<li id="li6" onmouseover="c('6')" onmouseout="d('6')"><img src="../../jpg/t6.gif" id="i6"/><a href="/file/selectFile?id=${loginUser.id}" id="a6" target="iframe">文件管理</a></li>
    				<li id="li7" onmouseover="c('7')" onmouseout="d('7')"><img src="../../jpg/t7.gif" id="i7"/><a href="/friendLink/selectFriendLink?id=${loginUser.id}" id="a7" target="iframe">友链管理</a></li>
    				<li id="li8" onmouseover="c('8')" onmouseout="d('8')"><img src="../../jpg/t8.gif" id="i8"/><a href="/userSet/selectInformation?id=${loginUser.id}" id="a8" target="iframe">系统设置</a></li>
    			</ul>
    		</div>
    		<div id="div5">
    			<iframe src="/yiBiaoPan/selectData?id=${loginUser.id}" name="iframe" width="99.5%" height="90.5%" scrolling="auto">

    			</iframe>
    			<p style="text-indent: 1cm;margin-top: 15px;">2019&nbsp;&copy;&nbsp;<font color="#5783bb">Tale</font></p>
    		</div>
    	</div>
 	</body>
</html>