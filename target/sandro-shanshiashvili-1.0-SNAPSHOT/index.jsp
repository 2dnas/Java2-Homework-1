<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 align="center"><%= "შინაური ცხოველების სარეგისტრაციო ფორმა" %>
</h1>
<br/>

<div align="center">

    <form name="formZoo" method="post" action="hello-servlet">
        <label>სახელი:</label>
        <input type="text" name="name" id="name"><br><br>
        <label>ჯიში:</label>
        <input type="text" name="breed"><br><br>
        <label>სქესი:</label>
        <input type="text" name="gender"><br><br>
        <label>ასაკი:</label>
        <input type="text" name="age"><br><br>

        <input type="submit" value="რეგისტრაცია" />

    </form>
</div>

<br/>



</body>
</html>