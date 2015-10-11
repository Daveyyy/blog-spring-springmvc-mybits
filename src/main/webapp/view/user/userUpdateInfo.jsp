<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/11
  Time: 下午5:57
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
  <title>修改个人信息</title>
</head>
<body>
<div>
  <div align="right">
    <a href="<%=basePath%>user/listUserInfo.do?username=${username}"> <font color="red">${username}</font></a>
    <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
  </div>
  <div><h2 align="center">修改个人信息</h2></div>
  <div>
    <form name="updateUserInfo" action="/user/updateUserInfo.do" method="post">
    <table border="1" width="50%" align="center">
      <tr>
        <td>用户Id:</td>
        <td>${user.userId}</td>
      </tr>
      <tr>
        <td>用户名:</td>
        <td><input type="text" name="userName" value="${user.userName}" ></td>
      </tr>
      <tr>
        <td>用户电话:</td>
        <td><input type="text" name="userPhone" value="${user.userPhone}"></td>
      </tr>
      <tr>
        <td>性别:</td>
        <td>
          <c:choose>
            <c:when test="${user.userSex == '男'}">
              <input type="radio" name="userSex" value="男" checked/>男
              <input type="radio" name="userSex" value="女"/>女
            </c:when>
            <c:when test="${user.userSex == '女'}">
              <input type="radio" name="userSex" value="男"/>男
              <input type="radio" name="userSex" value="女" checked/>女
            </c:when>
          </c:choose>

        </td>
      </tr>
      <tr>
        <td>邮箱:</td>
        <td><input type="text" name="userEmail" value="${user.userEmail}"></td>
      </tr>
      <tr>
        <td>注册时间:</td>
        <td><input type="text" name="createTime" value="${user.createTime}" readonly></td>
      </tr>
      <tr>
        <td>用户类型:</td>
        <td>
          <c:choose>
            <c:when test="${user.userType == 0}">
              <input type="text"  value="普通用户" readonly>
            </c:when>
            <c:when test="${user.userType == 1}">
              <input type="text"  value="管理员" readonly>
            </c:when>
          </c:choose>
        </td>
      </tr>
      <tr>
        <td>用户状态:</td>
        <td>
          <c:choose>
            <c:when test="${user.userState == 0}">
              <input type="text"  value="正常" readonly>
            </c:when>
            <c:when test="${user.userState == 1}">
              <input type="text"  value="冻结" readonly>
            </c:when>
          </c:choose>
        </td>
      </tr>
      <tr>
        <td>个人积分:</td>
        <td><input type="text" name="credit" value="${user.credit}" readonly></td>
      </tr>
      <tr>
        <td>最后登录时间:</td>
        <td><input type="text" name="lastLoginTime"  value="${user.lastLoginTime}" readonly></td>
      </tr>
      <tr>
        <td>最后登录IP:</td>
        <td><input type="text" name="lastIp" value="${user.lastIp}" readonly></td>
      </tr>
      <tr>
        <td align="center"><input type="submit" value="保存修改" name="submit" /></td>
        <td align="center"><a href="http://localhost:8080"><input type="button" name="comeback" value="返回首页"/></a></td>
      </tr>
    </table>
    </form>
  </div>
</div>
</body>
</html>
