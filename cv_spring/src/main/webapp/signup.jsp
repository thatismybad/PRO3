<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Sign up</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body class="text-center">
<form:form method="post" modelAttribute="userForm" class="form-sign">
    <h2>Sign up</h2>
    <spring:bind path="username">
        <form:label path="username" for="inputUsername" class="sr-only">Username</form:label>
        <form:input type="text" id="inputUsername" path="username" class="form-control input-no-radius-bottom" placeholder="Username.." />
    </spring:bind>
    <spring:bind path="password">
        <form:label path="password" for="inputPassword" class="sr-only">Username</form:label>
        <form:input type="password" id="inputPassword" path="password" class="form-control input-no-radius" placeholder="Password.." />
    </spring:bind>
    <spring:bind path="confirmPassword">
        <form:label path="confirmPassword" for="inputConfirmPassword" class="sr-only">Username</form:label>
        <form:input type="password" id="inputConfirmPassword" path="confirmPassword" class="form-control input-no-radius-top" placeholder="Verify password.." />
    </spring:bind>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
    <a class="mt-5 mb-3 text-muted" href="${contextPath}/signin">Already have an account? Sign in!</a>
</form:form>
</body>
</html>
