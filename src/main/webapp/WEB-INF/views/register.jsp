<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@include file="fragments/Header.jsp"%>
<!-- Page Content -->
<head>
    <style>
        .container1 {
            padding: 200px 0;
        }
    </style>
</head>


<div class="row">
    <div class="col"> </div>
    <div class="col-6">
        <div class="container1">
            <div id="login" class="signin-card">
                <p class="subhead">Description</p>
                <form action="" method="" class="" role="form">
                    <div id="form-login-username" class="form-group">
                        <input id="username" class="form-control" name="username" type="text" size="18" alt="login" required />
                        <span class="form-highlight"></span>
                        <span class="form-bar"></span>
                        <label for="username" class="float-label">login</label>
                    </div>
                    <div id="form-login-password" class="form-group">
                        <input id="passwd" class="form-control" name="password" type="password" size="18" alt="password" required>
                        <span class="form-highlight"></span>
                        <span class="form-bar"></span>
                        <label for="password" class="float-label">password</label>
                    </div>
                    <div>
                        <button class="btn btn-block btn-info ripple-effect" type="submit" name="Submit" alt="sign in">Sign in</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="col"> </div>
</div>
<%@include file="fragments/Footer.jsp"%>