<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@ page import="somePackage.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getQuantity() %> </p>
</body>
</html>
