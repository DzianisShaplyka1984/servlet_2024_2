<%@ page import="com.academy.model.Book" %>
<%@ page import="com.academy.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            Book book = (Book) request.getAttribute("book");
        %>

        <label>Book Details</label><br>
        <label>Hello user <%= ((User) session.getAttribute("user")).getLogin()%></label>

        <br>

        <%= book.getId() + " " + book.getTitle() + " " + book.getYear()%>

        <br>

        <label>(c) MyCoolCompany Inc.</label>
    </body>
</html>
