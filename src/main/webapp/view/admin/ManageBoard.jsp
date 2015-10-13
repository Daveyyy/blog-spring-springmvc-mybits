<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/13
  Time: 下午7:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<html>
<head>
  <title>论坛版块管理</title>
</head>
<body>
<div>
  <div>
    <h2 align="center"><font color="blue"> 论坛版块管理</font></h2>
  </div>
  <div align="right">
    <a href="<%=basePath%>user/listUserInfo.do?username=${username}" > <font color="red">${username}</font></a>
    <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
  </div>
  <div>
    <a href="<%=basePath%>view/admin/AddBoard.jsp">添加论坛版块</a>
  </div>
  <div class="listBoard">
    <div class="listBoard-title"> <h2 align="center"><strong>论坛版块信息</strong></h2></div>
    <div class="listBoard-content">

      <table border="2" align="center">
        <c:forEach items="${boards}" var="boards" varStatus="status">

          <tr >
            <td><font color="red">版块ID:</font></td>
            <td><font color="red">${boards.boardId}</font></td>
          </tr>
          <tr>
            <td >版块名称:</td>
            <td>${boards.boardName}</td>
          </tr>
          <tr>
            <td >版块描述:</td>
            <td style="height:70px;width:449px">${boards.boardDesc}</td>
          </tr>
          <tr>
            <td>版块总帖数:</td>
            <td>${boards.boardPostNum}</td>
          </tr>
          <tr>
            <td>
              <a href="">修改</a>
            </td>
            <td>
              <a href="">删除</a>
            </td>
          </tr>
        </c:forEach>
      </table>

    </div>
  </div>
</div>
</body>
</html>
