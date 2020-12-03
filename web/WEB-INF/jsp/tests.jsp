<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Garbage Testing System : Available tests</title>
</head>
<body>

<!-- content -->
<main>
    <h3>Your role is <i><c:out value="${user.roleName}"/></i>.</h3>
    <br/>

    <div>
        <c:forEach items="${tests}" var="test">
            <a href="Controller?command=go_to_questions&id=<c:out value="${test.testId}"/>"><c:out value="${test.title}"/></a>
            <button onclick="location.href='Controller?command=go_to_edit&entity=test&' +
                    'id=<c:out value="${test.testId}"/>&text=<c:out value="${test.title}"/>'">Edit</button>
            <button onclick="location.href='Controller?command=delete&entity=test&id=<c:out value="${test.testId}"/>'">Delete</button>
            <br/><br/>
        </c:forEach>
    </div>
    <c:if test="${user.roleName != 'student'}">
        <div>
            <br/>
            <button onclick="location.href='Controller?command=go_to_add&entity=test&id=<c:out value="${id}"/>'">Add test</button>
        </div>
    </c:if>
    <br/>
    <div>    <!-- buttons holder -->
        <button onclick="location.href='Controller?command=go_to_main'">Back</button>
    </div>
</main>

<!-- footer -->
<footer>
    <jsp:include page="footer.jsp"/>
</footer>

</body>
</html>
