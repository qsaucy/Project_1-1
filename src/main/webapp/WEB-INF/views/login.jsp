<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="fragments/Header.jsp"%>
<c:set var ="pageTitle" value="login stackFlow"/>
<style>
    .ID{
        max-width: 800px;
        margin: auto;
    }
</style>

<div id="login" class="ID">
    <c:if test="${errors!=null}">
        <ul>
            <c:forEach items="${errors}" var="error">
                <li>Error : ${error}</li>
            </c:forEach>
        </ul>
    </c:if>

    ${login}
    ${uname}
    <form id ="login-form" action="login.do" method="post">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
    </form>
</div>

<%@include file="fragments/Footer.jsp"%>