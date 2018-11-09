<%--
  Created by IntelliJ IDEA.
  User: damianjuzyk
  Date: 09/11/2018
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<div>
    <h1>Przelicznik Tekstu</h1>
    <output name="tekst"></output>
    <form method="post" action="licznikTekstu">
        <textarea name="pole" cols="30" rows="10" placeholder="Tu wpisz tekst do analizy"></textarea><br>
        <input type="submit" value="Wyślij">
    </form>
</div>

</body>
</html>
