<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Sign in</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body class="text-center">
    <form method="post" action="${contextPath}/login" class="form-sign">
        <h2><a href="${contextPath}/welcome">Continue to welcome</a></h2>
        <p>or</p>
        <h2 class="title">Sign in</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input name="username" type="text" id="inputUsername" class="form-control input-no-radius-bottom" placeholder="Username.." required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control input-no-radius-top" placeholder="Password.." required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <a class="mt-5 mb-3 text-muted" href="${contextPath}/signup">Don't have an account? Sign up!</a>
    </form>
</body>
</html>
