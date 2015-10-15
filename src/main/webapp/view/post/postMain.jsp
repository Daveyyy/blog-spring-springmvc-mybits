<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/14
  Time: 下午9:09
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
    <title>版块内容</title>
</head>
<body>
<div class="main">
  <div class="top">
    <div align="center">
      <h2>疾风论坛</h2>
    </div>
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
      <div class="content-top" >
        <div style='flaot:left;'><font color="red">&nbsp&nbsp${board.boardName}</font></div>
        <div style='flaot:right;'><a href="<%=basePath%>post/editorPost.do?boardId=${board.boardId}"><button>发表文章</button></a></div>
        <div style="clear:both"></div>
        </div>
      <div class="content-main">


      </div>
    </div>
  </div>




</div>
</body>
</html>
