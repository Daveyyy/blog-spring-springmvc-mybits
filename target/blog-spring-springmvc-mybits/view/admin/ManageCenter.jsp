<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/13
  Time: 下午6:37
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
    <title>论坛管理后台</title>
</head>
<body>
<div>
  <div>
    <h2 align="center"><font color="blue"> 论坛管理后台</font></h2>
  </div>
  <div align="right">
    <a href="<%=basePath%>user/listUserInfo.do?username=${username}" > <font color="red">${username}</font></a>
    <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
  </div>
  <a href="<%=basePath%>admin/ManageBoard.do"><button>管理版块</button></a>
</div>
</body>
</html>
