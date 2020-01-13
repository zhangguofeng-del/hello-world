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
    <title>预览文章</title>
    <link rel="stylesheet" type="text/css" href="../../css/fbwz.css"/>
    <script src="../../js/fbwz.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div id="div1">
    <div id="div2"><span>预览文章</span></div>
    <div id="div3">
        <%--<form action="#" method="post">--%>
            <table width="99%">
                <tr>
                    <td><input type="text" name="title" placeholder="文章标题" value="${book.title}" readonly="readonly"/></td>
                    <td><input type="text" name="path" placeholder="自定义访问路径，如 my-first-article 默认为文章id" readonly="readonly"/></td>
                </tr>
                <tr style="line-height: 35px;">
                    <td height="35px"><input type="text" name="label" value="${book.label}" placeholder="请输入文章标签" readonly="readonly"/></td>
                    <td>
                        <select name="classify" style="height: 26px;">
                            <option value="${book.classify}" selected = selected>${book.classify}</option>
                        </select>
                    </td>
                </tr>
                <tr style="line-height: 30px;">
                    <td colspan="2" height="35px">
                        <img src="../../jpg/lan2.gif"/>
                        <div id="cc2">
                            <a href="#">
                                <img src="../../jpg/yl2.gif"/>
                            </a>
                        </div>
                        <div id="cc1">
                            <a href="#">
                                <img src="../../jpg/zx1.gif"/>
                            </a>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <textarea name="words" rows="20%" cols="90%" readonly="readonly" placeholder="文章内容区..." style="width: 99%;">${book.words}</textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="font-family: arial;font-size: 10px;font-weight: bold;">
                        开启评论&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                </tr>
                <td colspan="2"><div id="bottom"><a href="/bookManage/showAllBook?id=${loginUser.id}"><img src="../../jpg/fhlb.gif" id="img1"/></a></div></td>
                </tr>
            </table>
        <%--</form>--%>
    </div>
</div>
</body>
</html>
