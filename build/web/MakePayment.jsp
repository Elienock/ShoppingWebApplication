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
            Double totalAmountDue = (Double) session.getAttribute("totalAmountDue");
        %>
        <style>
            *{

	margin: 0;

	padding: 0;

	font-family: arial;

	box-sizing: border-box;

}

body{

	height: 100vh;

	display: grid;

	place-items: center;

	background: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0.6)), url(image.jpg);

	background-size: 100% 100%;

	background-repeat: no-repeat;

}

table{

	width: 600px;

	box-shadow: -1px 12px 12px -6px rgba(0,0,0,0.5);

}

table, td, th{

	padding: 20px;

	border: 1px solid lightgray;

	border-collapse: collapse;

	text-align: center;

	cursor: pointer;

}

td{

	font-size: 18px;

}

th{

	background-color: blue;

	color: white;

}

tr:nth-child(odd){

	background-color: lightblue;

}

tr:nth-child(odd):hover{

	background-color: dodgerblue;

	color: white;

	transform: scale(1.5);

	transition: transform 300ms ease-in;

}

tr:nth-child(even){

	background-color: #ededed;

}

tr:nth-child(even):hover{

	background-color: lightgray;

	transform: scale(1.5);

	transition: transform 300ms ease-in;


}
        </style>
    </head>
    <body>
       
    <table>
  
        <tr>

            <th>Product Name</th>

            <th>Quantity</th>

            <th>Amount Due</th>

        </tr>
<c:forEach items='${sessionScope["items"]}' var="item">
        <tr>

            <td>${item.getProductName()}</td>

            <td>${item.getQty()}</td>

            <td>R${item.amountDue()}</td>
        </tr>
 </c:forEach>
    </table>
         <h2>The total amount Due is R<%=totalAmountDue%></h2>
</body>
</html>
