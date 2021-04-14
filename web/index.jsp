<%--
  Created by IntelliJ IDEA.
  User: 赵昌飞
  Date: 2021/1/22
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
   <form action="<%=request.getContextPath()%>/user/login">
     用户名:<input type="text" name="username"><br>
     密码:<input type="password" name="password"><br>
     <input type="submit" value="登录"><br>


   </form>
  </body>
</html>
