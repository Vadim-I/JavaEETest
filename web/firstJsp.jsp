<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
        <p>
            <%@ page import="java.util.Date, logic.TestClass" %>

            <% TestClass testClass = new TestClass(); %>

            <%=
                testClass.getInfo()
            %>
        </p>
</body>
</html>
