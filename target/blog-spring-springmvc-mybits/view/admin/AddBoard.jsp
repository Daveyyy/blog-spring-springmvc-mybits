<%--
  Created by IntelliJ IDEA.
  User: jinglingmei
  Date: 15/10/13
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/admin/AddBoard.do" method="post">
  <table width="500" border="1" align="center">
    <tr>
      <td colspan="2" align="center"><h2>添加版块</h2></td>
    </tr>
    <tr>
      <td>版块名:</td>
      <td><input type="text" name="boardName" style="width:449px">
      </td>
    </tr>
    <tr>
      <td>版块描述:</td>
      <td><input  type="text" name="boardDesc" style="height:51px;width:449px"/>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" name="submit" value="添加"/>
        <a href="/view/User/register.jsp"><input type="button" name="submit" value="返回"/></a>
      </td>
    </tr>
  </table>
</form>

</body>
</html>
