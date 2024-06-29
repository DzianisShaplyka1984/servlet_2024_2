<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <ul>
            <c:forEach items="${books}" var="book">
                <li>
                    <a href="http://localhost:8080/book?id=${book.id}"> ${book.title}
                        <c:if test="${book.year > 1000 && book.year < 2000}">
                            anticvar
                        </c:if>
                    </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
