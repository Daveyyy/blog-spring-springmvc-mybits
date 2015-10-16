<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/14
  Time: 下午10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>添加帖子</title>
</head>
<body>
<div class="main">

  <div class="addpost">
    <form name="form2" action="/post/addPost.do" method="post">
      <table width="300" border="1" align="center">
        <tr>
          <td colspan="2">编辑新帖子</td>
        </tr>
        <tr>
          <td><input type="hidden" name="postBoardId" value="<%=request.getParameter("boardId")%>"></td>
        </tr>
        <tr>
          <td><input  type="hidden" name="postUserName" value="<%=request.getParameter("userName")%>"></td>
        </tr>
        <tr>
          <td>文章名称:</td>
          <td ><input type="text" name="postTitle" style="height:50px;width:500px"></td>
        </tr>
        <tr>
          <td>文章内容:</td>
          <td ><input type="testarea" name="postContent" style="height:300px;width:500px"></td>
        </tr>

        <tr colspan="2">
          <td ><input type="submit" value="提交" name="submit" align="center"/></td>
          <td><a href="login.jsp"><input type="button" name="button" value="返回"> </a></td>
        </tr>
      </table>
    </form>
  </div>




</div>
</body>
</html>
