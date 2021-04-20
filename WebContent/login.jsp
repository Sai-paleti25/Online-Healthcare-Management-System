<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Hospital Management System</title>
<link rel="stylesheet" type="text/css" href="homestyle.css">
</head>

<body>


<%@include  file="header.jsp" %>

<%@include  file="navigation.jsp" %>

<section>

<form action="Hospitalmanagement" method="GET">
<input type="hidden" name="command" value="LOGIN" />
    <table cellpadding="10" align="right">
        <tr>
            <td><input type="radio" id="user" name="access_level" value="user">
                <label for="user">User</label></td>
            <td><input type="radio" id="admin" name="access_level" value="admin">
                <label for="admin">Admin</label></td>
        </tr>
        <tr>
            <td>
                Username:
            </td>
            <td>
                <input type= "text" name="username"><br>
            </td>
        </tr>

        <tr>
            <td>
                password:
            </td>
            <td>
                <input type= "password" name="password">
            </td>
        </tr>
        <tr>
            <td>
            <input type ="submit" value="submit">
           </td>
        </tr>
</table>
</form>
	
</section>


<%@include  file="footer.jsp" %>

</body>
</html>
