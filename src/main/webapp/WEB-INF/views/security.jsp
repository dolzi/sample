<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>

<h1>SECURITY TEST</h1>

<sec:authorize access="isAnonymous()">
    <h5><a href='<c:url value="/security/login"/>'>LOGIN</a>로그인 해주세요</h5>
</sec:authorize>

<a href='<c:url value="/page"/>'>GUEST</a>
<a href='<c:url value="/user/page"/>'>USER</a>
<a href='<c:url value="/member/page"/>'>MEMBER</a>
<a href='<c:url value="/admin/page"/>'>ADMIN</a>

</body>
</html>
