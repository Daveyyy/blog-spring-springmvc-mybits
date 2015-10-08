<%--
  Created by IntelliJ IDEA.
  User: Avlin
  Date: 15/10/7
  Time: 下午8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>疾风论坛</title>
</head>
<body>
<div>
    <div>
    疾风论坛
    </div>
    <div>
        <span><a href="view/user/userlogin.jsp">登录</a></span>
        <span><a href="">注册</a></span>
    </div>
</div>

</body>
</html>





