<%@ page import="java.util.List" %>
<%@ page import="com.colin.bean.BlogClass" %>
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
        <title>分类/标签管理</title>
        <link rel="stylesheet" type="text/css" href="../../css/flbq.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>分类/标签管理</span></div>
    		<div id="div3">	
	    		<div id="div4">
	    			<p style="background-color: #6c8ad9;color: #fff;">分类列表</p>
					<span id="span1">默认分类&nbsp;(${c})</span>
	    			<c:forEach items="${list}" var="classList">
						<c:if test="${!(classList.blogClass eq '默认分类')}" var="arrayList">
							<span id="span2">
							${classList.blogClass}
								&nbsp;(${classList.selfCount})&nbsp;
							<input type="image" value="" src="../../jpg/sj.gif"/>
							<a href="/classifyAndLabel/deleteClassify?id=${loginUser.id}&className=${classList.blogClass}"><button>x</button></a>
	    				</span>
						</c:if>

					</c:forEach>
	    		</div>
	    		<div id="div5">
					<p style="background-color: #ee3c79;">标签列表</p>
						<span>标签数&nbsp;(${labelCount})&nbsp;
							<input type="image" value="" src="../../jpg/sj.gif"/>
						</span>
				</div>
	    		<div id="div6">
	    			<form action="/classifyAndLabel/insertClassify?id=${loginUser.id}" method="post">
	    				<input type="text" name="flmc" id="flmc" placeholder=" 请输入分类名称"/>
	    				<input type="submit" name="" id="" value="保存分类"/>
	    			</form>
	    			
	    		</div>
	    	</div>
    	</div>
 	</body>
</html>