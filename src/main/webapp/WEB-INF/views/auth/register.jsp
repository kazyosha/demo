<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <h2>Register</h2>
        <form method="post" action="${pageContext.request.contextPath}/auth/register">
            <div class="form-group">
                <label>Username</label>
                <input type="text" name="username" class="form-control" required/>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" class="form-control" required/>
            </div>

            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" class="form-control" required/>
            </div>

            <div class="form-group">
                <label>Phone</label>
                <input type="text" name="phone" class="form-control"/>
            </div>

            <button type="submit" class="btn btn-primary">Register</button>
        </form>
        <c:if test="${not empty message}">
            <div class="alert alert-success" style="margin-top: 10px;">
                    ${message}
            </div>
        </c:if>
        <c:if test="${not empty error}">
            <div class="alert alert-danger" style="margin-top: 10px;">
                    ${error}
            </div>
        </c:if>
    </div>
</div>
</body>
</html>
