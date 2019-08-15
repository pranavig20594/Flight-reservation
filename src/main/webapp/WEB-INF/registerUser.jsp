<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <h2><title>User Registration</title></h2>
</head>
<body>
<form action="registerUser" method ="post">
    <pre>
    First Name : <input type="text" name="firstName"/>
    Last Name : <input type="text" name="lastName"/>
    Email : <input type="text" name="email"/>
    Password : <input type="password" name="password"/>
    Confirm Password : <input type="password" name="confirmPassword"/>
    <input type="submit" value="Register"/>
        </pre>

</form>

${msg}
</body>