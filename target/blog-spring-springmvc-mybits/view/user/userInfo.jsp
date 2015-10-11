<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/11
  Time: 下午4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户个人信息</title>
</head>
<body>
    <div>
      <div align="right">
        <a href="<%=basePath%>user/listUserInfo.do?username=${username}"> <font color="red">${username}</font></a>
        <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
      </div>
      <div><h2 align="center">用户个人信息</h2></div>
      <div>
        <table border="1" width="50%" align="center">
          <tr>
            <td>用户Id:</td>
            <td>${user.userId}</td>
          </tr>
          <tr>
            <td>用户名:</td>
            <td>${user.userName}</td>
            </tr>
          <tr>
            <td>用户电话:</td>
            <td>${user.userPhone}</td>
          </tr>
          <tr>
            <td>性别:</td>
            <td>${user.userSex}</td>
            </tr>
          <tr>
            <td>邮箱:</td>
            <td>${user.userEmail}</td>
          </tr>
          <tr>
            <td>注册时间:</td>
            <td>${user.createTime}</td>
          </tr>
          <tr>
            <td>用户类型:</td>
            <td>
              <c:choose>
                <c:when test="${user.userType == 0}">
                  普通用户
                </c:when>
                <c:when test="${user.userType == 1}">
                  管理员
                </c:when>
              </c:choose>
            </td>
          </tr>
          <tr>
            <td>用户状态:</td>
            <td>
              <c:choose>
                <c:when test="${user.userState == 0}">
                  正常
                </c:when>
                <c:when test="${user.userState == 1}">
                  <font color="red">冻结</font>
                </c:when>
              </c:choose>
            </td>
          </tr>
          <tr>
            <td>个人积分:</td>
            <td>${user.credit}</td>
          </tr>
          <tr>
            <td>最后登录时间:</td>
            <td>${user.lastLoginTime}</td>
          </tr>
          <tr>
            <td>最后登录IP:</td>
            <td>${user.lastIp}</td>
          </tr>
          <tr>
            <td align="center"><a href="<%=basePath%>user/userUpdateInfo.do?username=${user.userName}"><button>修改个人信息</button></a></td>
            <td align="center"><a href="http://localhost:8080"><input type="button" name="comeback" value="返回首页"/></a></td>
          </tr>
        </table>

      </div>
    </div>
</body>
</html>
