<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!-- 

Expression																Description

hasRole([role])															현재 주체에 지정된 역할이 있는지 여부를 반환 합니다. 제공된 역할이 'ROLE_'로 시작하지 않으면 기본적으로 추가됩니다. DefaultWebSecurityExpressionHandler의 defaultRolePrefix을 수정하여 사용자 정의를 할 수 있습니다.
hasAnyRole([role1,role2]												현재 주체에 제공된 역할 (쉼표로 구분 된 문자열 목록으로 제공됨)이 있는지 여부를 반환 합니다. 제공된 역할이 'ROLE_'로 시작하지 않으면 기본적으로 추가됩니다. DefaultWebSecurityExpressionHandler의 defaultRolePrefix을 수정하여 사용자 정의를 할 수 있습니다.
hasAuthority([authority])												현재 주체에 지정된 권한이 있는지 여부를 반환 합니다.
hasAnyAuthority([authority1,authority2])								현재 주체에 제공된 역할 (쉼표로 구분 된 문자열 목록으로 제공됨)이 있는지 여부를 반환 합니다.
principal																현재 사용자를 나타내는 주체 개체에 직접 액세스 할 수 있습니다.
authentication															SecurityContext Authentication에서 얻은 현재 개체에 직접 액세스 할 수 있습니다.
permitAll																항상 허용
denyAll																	항상 불허
isAnonymous()															현재 주체가 익명 사용자인 경우 true 반환
isRememberMe()															현재 주체가 remember-me 사용자 인 경우 true 반환
isAuthenticated()														사용자가 익명이 아닌 경우 true 반환
isFullyAuthenticated()													사용자가 익명 또는 remember-me 사용자가 아닌 경우 true 반환
hasPermission(Object target, Object permission)							사용자가 주어진 권한에 대해 제공된 대상에 액세스 할 수 있는지 여부를 반환합니다. 예를 들면 hasPermission(domainObject, 'read')
hasPermission(Object targetId, String targetType, Object permission)	사용자가 주어진 권한에 대해 제공된 대상에 액세스 할 수 있는지 여부를 반환합니다. 예를 들면 hasPermission(1, 'com.example.domain.Message', 'read')

출처: https://oingdaddy.tistory.com/76 [SI Supply Depot]


principal : principal
MemberVO : principal.member
사용자 이름 : principal.member.userName
사용자 아이디 : principal.username
사용자 권한 리스트 : principal.member.authList

출처: https://taetae0079.tistory.com/6 [TH블로그]

 -->

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>

<h1>SECURITY TEST</h1>

<sec:authorize access="isAnonymous()">
    <h5><a href='<c:url value="/security/login"/>'>LOGIN</a>로그인 해주세요</h5>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
	<h5><sec:authentication property="principal.username"/>님, 반갑습니다.</h5>
    <form action="/logout" method="POST">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <button type="submit">LOGOUT</button>
    </form>
</sec:authorize>

<a href='<c:url value="/page"/>'>GUEST</a>
<a href='<c:url value="/user/page"/>'>USER</a>
<a href='<c:url value="/member/page"/>'>MEMBER</a>
<a href='<c:url value="/admin/page"/>'>ADMIN</a>

</body>
</html>
