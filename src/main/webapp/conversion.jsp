<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Number Conversion</title>
</head>
<body>
<form action="conversion" method="get">
  <label>Number:</label>
  <label>
    <input type="text" name="number">
  </label><br>
  <label>System:</label>
  <label>
    <select name="system">
      <option value="2">Binary</option>
      <option value="8">Octal</option>
      <option value="10">Decimal</option>
      <option value="16">Hexadecimal</option>
    </select>
  </label><br>
  <input type="submit" value="Convert">
</form>
</body>
</html>
