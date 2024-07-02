<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="java.util.Iterator" %>
    <%@page import="com.model.Match" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VSB</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 50px;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            margin: auto;
        }
        input[type='text'], input[type='date'], textarea {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type='radio'] {
            margin: 10px;
        }
        input[type='submit'] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 3px;
        }
        input[type='submit']:hover {
            background-color: #45a049;
        }
        ul {
            text-align: left;
            color: red;
        }
        li {
            list-style-type: none;
        }
    </style>

</head>
<body>
<% List<String> li=(List<String>)request.getAttribute("errors");
if(li!=null){
	Iterator<String> itr=li.iterator();

	%>
	<ul>
	<% while(itr.hasNext()){ %>
	<li><%=itr.next() %></li></ul><% } %><% } %>
<form action="Bookticketcon" method="post">
Name:<input type="text" name="name"/><br><br>
age:<input type="text" name="age" value="0"/><br><br>
Gender:<input type="radio" name="gender" value="Male"/>Male
<input type="radio" name="gender" value="Female"/>Female<br><br>
Address:<textarea rows="4" cols="4"></textarea><br><br>
MatchName:<input type="text" name="match" /><br><br>
MatchDate:<input type="date" name="date" />
<input type="submit" value="submit">

</form>

</body>
</body>
</html>
