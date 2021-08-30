<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>output student details</title>
</head>
<body> 
<h1 align="center">Student details</h1>
<jsp:useBean id="demo" class="demo1.demo" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="demo"/>
<table align="center">
			<tbody> 
				<tr>
					<td>Name:<jsp:getProperty property="name" name="demo"/> </td>

				</tr>	
				<tr>
					<td>UID:<jsp:getProperty property="uid" name="demo"/> </td>
					
				</tr>
				<tr>
					<td>Email:<jsp:getProperty property="email" name="demo"/>  </td>
					
				</tr>
				<tr>
					<td>Mobile:<jsp:getProperty property="number" name="demo"/> </td>
					
				</tr>
		 		<tr>
					<td>Batch:<jsp:getProperty property="batchno" name="demo"/> </td>
				 
			 </tbody> 
		</table>
</body>
</html>