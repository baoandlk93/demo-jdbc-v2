<%--
  Created by IntelliJ IDEA.
  User: AN HA
  Date: 28-10-2024
  Time: 9:15 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>
                    ${product.id}
            </td>
            <td>
                    ${product.name}
            </td>
            <td>
                    ${product.description}
            </td>
            <td>
                    ${product.price}
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
