<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/25
  Time: 下午3:59
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
    <title>回复页面</title>
</head>
<body>
<div class="main">
  <div class="top">
    <div align="right">
      <c:choose>
        <c:when test="${username !=null}">
          欢迎回来:
          <a href="<%=basePath%>user/listUserInfo.do?username=${username}"> <font color="red">${username}</font></a>
          <c:if test="${username == 'admin'}">
            <a href="<%=basePath%>admin/ManageCenter.do"><button>登入管理后台</button></a>
          </c:if>
          <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
        </c:when>
        <c:when test="${username ==null}">
          <font color="red">您还未登录!  </font>
          <span><a href="<%=basePath%>view/user/userlogin.jsp">登录 </a></span>
          <span><a href="<%=basePath%>view/user/user_register.jsp">注册</a></span>
        </c:when>
      </c:choose>
  </div>
    <div class="content">
      <form name="fromReply" action="/reply/addreply.do" method="post">
        <table width="300" border="1" align="center">
          <tr>
            <td colspan="2">编辑回复</td>
          </tr>
          <tr>
            <td><input type="hidden" name="replyPostId" value="<%=request.getParameter("replypostid")%>"></td>
          </tr>
          <tr>
            <td><input  type="hidden" name="replyUserName" value="<%=request.getParameter("replyusername")%>"></td>
          </tr>
          <tr>
            <td>回复内容:</td>
            <td ><input type="testarea" name="replyContent" style="height:300px;width:500px"></td>
          </tr>

          <tr colspan="2">
            <td ><input type="submit" value="提交" name="submit" align="center"/></td>
            <td><a href="login.jsp"><input type="button" name="button" value="返回"> </a></td>
          </tr>
        </table>
       </form>
    </div>
</div>
</div>
</div>
</body>
</html>
