<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { padding-top: 70px; }
        .product { margin-bottom: 30px; }
        .product img { width: 100%; height: auto; }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">MySpringApp</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="${pageContext.request.contextPath}/auth/login">Login</a></li>
            <li><a href="${pageContext.request.contextPath}/auth/register">Register</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
        <h1>Welcome to MySpringApp!</h1>
        <p>This is a sample homepage for your Spring MVC project.</p>
    </div>

    <h2>Featured Products</h2>
    <div class="row">
        <div class="col-sm-4 product">
            <img src="https://via.placeholder.com/300x200" alt="Product 1">
            <h4>Product 1</h4>
            <p>Some description for product 1.</p>
        </div>
        <div class="col-sm-4 product">
            <img src="https://via.placeholder.com/300x200" alt="Product 2">
            <h4>Product 2</h4>
            <p>Some description for product 2.</p>
        </div>
        <div class="col-sm-4 product">
            <img src="https://via.placeholder.com/300x200" alt="Product 3">
            <h4>Product 3</h4>
            <p>Some description for product 3.</p>
        </div>
    </div>
</div>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
</body>
</html>
