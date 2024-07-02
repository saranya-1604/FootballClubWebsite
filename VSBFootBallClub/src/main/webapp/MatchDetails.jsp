<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="com.model.MatchDao" %>
    
<!DOCTYPE html>
<html>
<style>
    table {
        width: 80%;
        border-collapse: collapse;
        margin: 20px auto;
    }
    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
<head>
<meta charset="UTF-8">
<title>Foot ball club</title>
</head>
<body>
<h2>All available match details are--</h2>
<table>
<tr><th>SL no</th><th>Title</th><th>Place</th><th>MatchDate</th></tr>
<%
ResultSet rs=new MatchDao().retrieveMatch();
while(rs.next()){
%>
<tr>
<th><%=rs.getInt(1)%> </th><th><%=rs.getString(2) %></th><th><%=rs.getString(3) %></th><th><%=rs.getString(4) %></th></tr><% } %>
</table>
</body>
</html>