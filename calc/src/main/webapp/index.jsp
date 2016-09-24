<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Summer</title>
  </head>
  <body>
    <form>
        <input type="text" name="x" value="${x}"/>
        +
        <input type="text" name="y" value="${y}"/>
        = ${sum}
        <br/>
        <input type="submit" value="Calc"/>
    </form>
  </body>
</html>