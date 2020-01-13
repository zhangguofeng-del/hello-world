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
        <title>仪表盘</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ybb.css"/>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>Tale仪表盘</span></div>
	    	<div id="div3">
	    		<div id="div4" style="background-image: url(../../jpg/c1.gif);"><span>${bookCount}</span></div>
	    		<div id="div4" style="background-image: url(../../jpg/c2.gif);"><span>${guestCount}</span></div>
	    		<div id="div4" style="background-image: url(../../jpg/c3.gif);"><span>${fileCount}</span></div>
	    		<div id="div4" style="background-image: url(../../jpg/c4.gif);"><span>${friendLinkCount}</span></div>
	    	</div>
	    	<div id="div5">
	    		<span>最新文章</span>
	    		<ul>
					<c:forEach items="${bookList}" var="bookList2">
						<li>${bookList2.title}
							<div id="count" style="width: 20px;height: 20px;
									margin-right: 20px;color: #fff;background-image: url('${pageContext.request.contextPath}/jpg/count.gif');
									float: right;">
								<span>${bookList2.pageview}</span>
							</div></li>
					</c:forEach>
	    		</ul>
	    	</div>
	    	<div id="div6">
	    		<span>最新留言</span>
	    		<ul>
					<c:forEach items="${guestList1}" var="guestList2" begin="0" end="4">
						<li>${guestList2.userName}&nbsp;&nbsp;<font color="black">于&nbsp;${guestList2.guestCreateTime}</font>&nbsp;&nbsp;:&nbsp;&nbsp;${guestList2.words}</li>
					</c:forEach>
	    		</ul>
	    	</div>
    	</div>
 	</body>
</html>