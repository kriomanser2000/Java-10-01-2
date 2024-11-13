<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <title>Multiplication Table</title>
</head>
<body>
<h2>Enter num for multiplication table</h2>
<form action="multiplication-servlet" method="POST">
    <label for="number">Num: </label>
    <input type="text" id="number" name="number" required>
    <button type="submit">Show multiplication table</button>
</form>
</body>
</html>
