<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up to Garbage Testing System</title>
</head>
<body>

    <!-- header -->
    <header>
        <jsp:include page="header.jsp"/>
    </header>

    <!-- main -->
    <main>
        <div> <!-- registration container -->
            <form action="Controller" method="post">
                <input type="hidden" name="command" value="signup"/>

                <br/>
                <label for="login">Login:</label>
                <input type="text" id="login" name="login"/>

                <br/>
                <label for="email">Name</label>
                <input type="text" id="email" name="email"/>

                <br/>
                <label for="name">Name</label>
                <input type="text" id="name" name="name"/>

                <br/>
                <label for="lastname">Lastname</label>
                <input type="text" id="lastname" name="lastname"/>

                <br/>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>

                <br/>
                <input type="submit" value="Sign Up"/>
            </form>
        </div>
    </main>

    <!-- footer -->
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</body>
</html>
