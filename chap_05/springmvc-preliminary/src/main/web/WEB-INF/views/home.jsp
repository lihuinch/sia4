<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: T-er
  Date: 2019/7/10
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>
<body>
<h1>Welcome to spittr</h1>

<a href="<c:url value="/spittles"/>">Spittles</a> |
<a href="<c:url value="/spitter/register"/>">register</a>

</body>
</html>
