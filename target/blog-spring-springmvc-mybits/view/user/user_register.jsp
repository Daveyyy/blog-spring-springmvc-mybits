<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/11
  Time: 下午1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户注册</title>
</head>
<body>
<form name="form2" action="/user/register.do" method="post">
  <table width="300" border="1" align="center">
    <tr>
      <td colspan="2">注册窗口</td>
    </tr>
    <tr>
      <td>用户名:</td>
      <td><input type="text" name="userName"></td>
    </tr>
    <tr>
      <td>密码:</td>
      <td><input type="password" name="passWord"></td>
    </tr>
    <tr>
      <td>手机:</td>
      <td><input type="text" name="userPhone"></td>
    </tr>
    <tr>
      <td>邮箱:</td>
      <td><input type="text" name="userEmail"></td>
    </tr>
    <tr>
      <td>性别:</td>
      <td><input type="radio" name="userSex" value="男" checked/>男<input type="radio" name="userSex" value="女"/>女</td>
    </tr>
    <tr colspan="2">
      <td><input type="submit" value="提交" name="submit" align="center"/></td>
      <td><a href="login.jsp"><input type="button" name="button" value="返回"> </a></td>
    </tr>
  </table>
</form>
</body>
</html>
