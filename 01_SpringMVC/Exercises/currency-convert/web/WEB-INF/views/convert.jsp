<%--
  Created by IntelliJ IDEA.
  User: KimAnh
  Date: 10/13/2020
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert currency</title>
</head>
<body>
<form action="/calculate">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="rate" value="0"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="usd" value="0"/><br/>
    <input type = "submit" value = "Converter"/>
</form>
</body>
</html>
