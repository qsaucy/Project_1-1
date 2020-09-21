<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@include file="fragments/Header.jsp"%>
<!-- Page Content -->
<div class="container">
    <div class="row">
        <div class="Register Form">

            <div class="Register title">
                <h2>Register</h2>
            </div>

            <form class="Register Form">
                <div class="row">
                    <label>First Name</label>
                    <input class="w3-input" type="text">
                </div>
                <div class="row">
                    <label>Last Name</label>
                    <input class="w3-input" type="text">
                </div>
                <div class="row">
                    <label>Mail address</label>
                    <input class="w3-input" type="text">
                </div>
            </form>

        </div>
    </div>
</div>
<%@include file="fragments/Footer.jsp"%>