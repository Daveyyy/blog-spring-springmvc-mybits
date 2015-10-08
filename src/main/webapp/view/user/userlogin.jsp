<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/8
  Time: 下午9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<form action="/user/userlogin.do" method="post">
  <table width="300" border="1" align="center">
    <tr>
      <td colspan="2">登入窗口</td>
    </tr>
    <tr>
      <td>用户名:</td>
      <td><input type="text" name="userName">
      </td>
    </tr>
    <tr>
      <td>密码:</td>
      <td><input  type="password" name="passWord"/>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" name="submit" value="登录"/>
        <a href="/view/User/register.jsp"><input type="button" name="submit" value="注册"/></a>
      </td>
    </tr>
  </table>
</form>



</body>
</html>
