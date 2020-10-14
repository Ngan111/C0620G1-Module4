<%--
  Created by IntelliJ IDEA.
  User: KimAnh
  Date: 10/14/2020
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Condiments</title>
  </head>
  <body>
<form action="/choose">
  <div align="center">
    <h2>Sandwich Condiments</h2>
    <input type="checkbox" id="tomato" name="condiment" value="Tomato">
    <label for="tomato">Tomato</label><br>
    <input type="checkbox" id="lettuce" name="condiment" value="Lettuce">
    <label for="lettuce">Lettuce</label><br>
    <input type="checkbox" id="mustard" name="condiment" value="Mustard">
    <label for="mustard">Mustard</label><br>
    <input type="checkbox" id="sprouts" name="condiment" value="Sprouts">
    <label for="sprouts">Sprouts</label><br>
    <br>
    <input type="submit" value="save">
  </div>
</form>

  </body>
</html>
