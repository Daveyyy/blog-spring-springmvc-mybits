<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>

    <script>
        $(document).ready(function(){
            $username =$.session.get('username');
            if($username == null){
                alert("hahahah");
            }else{
                alert("heiheihei")
            }
        });
    </script>
<title>疾风论坛</title>
</head>
<div>
   <div align="center">
       <h2>疾风论坛</h2>
       </div>
    <div align="right">
     <c:choose>
           <c:when test="${username !=null}">
             欢迎回来:
               <a href="<%=basePath%>user/listUserInfo.do?username=${username}"> <font color="red">${username}</font></a>
              <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
             </c:when>
             <c:when test="${username ==null}">
               <font color="red">您还未登录!  </font>
             <span><a href="<%=basePath%>view/user/userlogin.jsp">登录</a></span><span><a href="<%=basePath%>view/user/user_register.jsp">注册</a></span>
             </c:when>
    </c:choose>
    </div>
</div>
</body>
</html>





