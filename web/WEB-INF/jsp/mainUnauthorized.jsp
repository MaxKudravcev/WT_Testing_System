<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
    <c:if test="${param.register == 'success'}">
        <h2>You have signed up successfully!</h2>
    </c:if>
    <c:if test="${param.signin == 'error'}">
        <h2>Invalid login or password.</h2>
    </c:if>

    <div> <!-- login form -->
        <h3>Sign In:</h3>
        <form action="Controller" method="post">
            <input type="hidden" name="command" value="signin"/>

            <br/>
            <label for="login">Login:</label>
            <input type="text" id="login" name="login"/>

            <br/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>

            <br/>
            <input type="submit" value="Sign In!"/>
        </form>
    </div>

    <div>    <!-- buttons holder -->
        <button onclick="location.href='Controller?command=go_to_signup'">Sign Up!</button>
    </div>
</body>
</html>
