<%--
  Created by IntelliJ IDEA.
  User: SmartBook
  Date: 23.05.2020
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>${locale}</title>

</head>
<body>
<table>
    <tr>
        <th>brand</th>
        <th>model</th>
        <th>year</th>
    </tr>
    <tbody>
    <!--   for (Todo todo: todos) {  -->
    <h1>${locale}</h1>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.year}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
