<%-- 
    Document   : agecalculator
    Created on : Sep 26, 2020, 3:14:39 PM
    Author     : 798382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age:<input type="text" name="age"><br>
            <input type="submit" value="Age next birthday"> 
        </form>
        ${message}<br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
