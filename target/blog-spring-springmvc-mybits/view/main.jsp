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

   <span>
    疾风论坛
    </span>
    <c:choose>
        <c:when test="${username !=null}">
        ${username}
        <a href="<%=basePath%>user/loginout.do"><button name="logout" >注销</button></a>
        </c:when>
        <c:when test="${username ==null}">
        <span><a href="<%=basePath%>view/user/userlogin.jsp">登录</a></span>
        <span><a href="">注册</a></span>
        </c:when>
    </c:choose>
</div>

</body>
</html>





