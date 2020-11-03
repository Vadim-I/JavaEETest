<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
        <p>
            <%
                String name = request.getParameter("name");
            %>

            <%= "Hello, " + name %>
        </p>
</body>
</html>
