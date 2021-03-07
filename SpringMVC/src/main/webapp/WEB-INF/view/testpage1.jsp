<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is testpage 1 ${name}</h1>
<form action="login/save" method="post">
<!-- //User(user_id ,f_name, l_name, password, age, gender, emailid, mobile_no, address, role) -->
User Id : <input type="text" id="user_id" name="user_id"> <br><br>
Firstname : <input type="text" id="f_name" name="f_name"> <br><br>
Middlename : <input type="text" id="m_name" name="m_name"> <br><br>
Lastname : <input type="text" id="l_name" name="l_name"> <br><br>
Password : <input type="text" id="password" name="password"> <br><br>
Age : <input type="text" id="age" name="age"> <br><br>
<!-- Gender:
<input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
<input type="radio" id="other" name="gender" value="other">
<label for="other">Other</label> -->
email_id : <input type="email" id="email_id" name="email_id"> <br><br>
mobile_no : <input type="text" id="mobile_no" name="mobile_no"> <br><br>
role : <input type="text" id="role" name="role"> <br><br>

<input type="submit" value="Login">
</form>
</body>
</html>