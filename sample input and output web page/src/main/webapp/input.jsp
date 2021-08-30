<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Student Details</title>
<style>
body {
  background-color: AntiqueWhite;
  background-size:center; 
  -moz-background-size: cover; 
  -webkit-background-size: cover;
  -o-background-size: cover; 
  height: 100%; 
  position:absolute;
  width:100%;
}
</style>
</head>
<body> 
<h1 align="center" style="color:olive">Enter the Student Details</h1>
	<jsp:useBean id="demo" class="demo1.demo" scope="session"></jsp:useBean> 
	<form action="output.jsp" method="post">
	<!-- <img src="<c:url value="C:\Users\user\Pictures\Saved Pictures\19685.jpg""/>  background-image: url('1670184.jpg'); -->
		<table border="2" align="center">
			<tbody> 
				<tr>
					<!-- <td><h4 style="color:brown">Name:</h4></td> -->
					<td>Name:</td>
					<td><input type="text" name="name" value=""> </td>
				</tr>	
				<tr>
					<td>UID:</td>
					<td><input type="text" name="uid" value=" "></td>	
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" value=""> </td>
				</tr>
				<tr>
					<td>Mobile number:</td>
					<td><input type="tel" name="number" value=" "> </td>
				</tr>
		 		<tr>
					<td>Batch:</td>
					<td><input type="text" name="batchno" value=" "> </td>
				</tr> 
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Submit"></td>
				</tr> 
			 </tbody> 
		</table>
			 
	</form>

</body>
</html> 