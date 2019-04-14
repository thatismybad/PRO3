<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Welcome</title>
    <title>Sign up</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/welcome.css" />
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Auth Example</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="#">Dashboard</a>
        <a class="p-2 text-dark" href="#">Page X</a>
        <a class="p-2 text-dark" href="#">Page Y</a>
        <a class="p-2 text-dark" href="#">Page Z</a>
    </nav>
    <security:authorize access="isAnonymous()">
        <a class="p-2 btn btn-link" href="${contextPath}/login">Sign in</a>
        <a class="p-2 btn btn-link" href="${contextPath}/signup">Sign up</a>
    </security:authorize>
    <security:authorize access="isAuthenticated()">
        <form id="logoutForm" class="logout-button" action="${contextPath}/logout" method="post">
            <a class="btn btn-link" onclick="document.forms['logoutForm'].submit()">Logout</a>
        </form>
    </security:authorize>
</div>
<div class="container">
    <security:authorize access="isAnonymous()">
        <p>Welcome, guest!</p>
        <img src="https://media.giphy.com/media/Nx0rz3jtxtEre/source.gif" alt="Hello there!">
    </security:authorize>
    <security:authorize access="isAuthenticated()">
        <p>Hello there..</p>
        <img src="https://media.giphy.com/media/7JC7bCJJGj44aBwB8p/source.gif" alt="General Kenobi!">
    </security:authorize>
</div>
</body>
</html>
