<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Garbage Testing System</title>
  </head>
  <body>

  <!-- header -->
  <header>
    <jsp:include page="WEB-INF/jsp/header.jsp"/>
  </header>

  <!-- content -->
  <main>
    <div>    <!-- buttons holder -->
      <button onclick="location.href='Controller?command=go_to_signup'">Sign Up!</button>
    </div>
  </main>

  <!-- footer -->
  <footer>
    <jsp:include page="WEB-INF/jsp/footer.jsp"/>
  </footer>

  </body>
</html>
