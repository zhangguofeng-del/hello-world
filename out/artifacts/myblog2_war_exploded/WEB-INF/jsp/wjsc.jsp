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
        <title>文件上传</title>
        <link rel="stylesheet" type="text/css" href="../../css/wjsc.css"/>
        <script src="../js/wjsc.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2"><span>文件管理</span></div>
    		<div id="div3">
    			<form action="/file/uploadFile?id=${loginUser.id}" method="post" enctype="multipart/form-data">
    				<input type="file" name="myFile"/> <br>
    				<input type="submit" value="上传"/>
    			</form>
    		</div>

				<table>
					<tr>
						<c:forEach items="${list1}" var="fileList">
						<td style="width: 200px;text-align: center">
							<div id="div4">
								<img src="../../jpg/ft1.gif" id="img1" style="display: inline-block;"/>
								<br /><span>${fileList}</span><br>
							</div>
						</td>
						</c:forEach>
					</tr>
					<tr>
						<c:forEach items="${list}" var="myFile">
							<td style="width: 150px;text-align: center">
								<div id="div4">
									<a href="/file/deleteFile?fileId=${myFile.fileId}&id=${loginUser.id}">
										<button id="ss1" style="background-color: #6c8ad9;width: 50px;border: 0;color: white;margin-left: 9px">
											删除
										</button>
									</a>
								</div>
							</td>
						</c:forEach>
					</tr>
				</table>
    	</div>
 	</body>
</html>