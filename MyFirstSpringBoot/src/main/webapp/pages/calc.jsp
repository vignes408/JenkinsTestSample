<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculate" method="post">
        Operand 1: <input type="text" name="num1"><br>
        Operand 2: <input type="text" name="num2"><br>
        Operator:
        <select name="answer">
            <option value="add">+</option>
            <option value="subtract">-</option>
            <option value="multiply">*</option>
            <option value="divide">/</option>
        </select><br>
        <input type="submit" value="Calculate">
    </form>
    <p>Result: ${result}</p>
</body>
</html>
