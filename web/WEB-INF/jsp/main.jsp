<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
    <h2>Welcome, <c:out value="${user.name}"/></h2>
    <br/>

    <div>    <!-- buttons holder -->
        <button onclick="location.href='Controller?command=signout'">Sign Out</button>
    </div>
</body>
</html>
