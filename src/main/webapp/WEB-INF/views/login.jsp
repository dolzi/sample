<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>

<form action="/login" method="post">
    <input type="text" name="userId"><br/>
    <input type="password" name="userPw" ><br/>
    <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/><br/>
    <button type="submit">login</button>
</form>

<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
    <font color="red">
       	Your login attempt was not successful due to <br/>
		${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        <c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>
    </font>
</c:if>

</body>
</html>
