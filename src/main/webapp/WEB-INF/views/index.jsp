<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="calculator" method="post">
    <input type="number"name="firstOperand" placeholder="First Operator">
    <input type="number"name="secondOperand" placeholder="Second Operator">
    <br>
    <br>
    <button name="operator" value="addition">Addition(+)</button>
    <button name="operator" value="subtraction">Subtraction(-)</button>
    <button name="operator" value="multiplication">Multiplication(X)</button>
    <button name="operator" value="division">Division(/)</button>
  </form>
  <p>${expression}</p>
  </body>
</html>
