<%-- 
    Document   : MakePayment
    Created on : 12 Apr 2022, 4:02:12 PM
    Author     : lubay
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.business.item.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make payment Page</title>
        <%
        
String str = (String) session.getAttribute("str");
        
        %>
    </head>
    <body>
        <ul>
            
            <c:forEach items='${sessionScope["items"]}' var="item">
                
                <li>${item.getProductName()} :  ${item.getQty()}</li>
                
            </c:forEach>
            
        </ul>
    </body>
</html>
