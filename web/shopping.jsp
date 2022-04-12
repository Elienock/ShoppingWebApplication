<%-- 
    Document   : shopping
    Created on : 12 Apr 2022, 2:29:54 PM
    Author     : lubay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Page</title>
    </head>
    <%
        String name = (String) session.getAttribute("name");
    %>
    <body>
        <h1>Welcome to the shopping Page Mr/Mrs <%=name%></h1>

        <form action="ShoppingServlet.do" method="Post">
            Socks R20: <input type="number" name="qty" >
            <button type="Submit" name="product" value="sock">Add to cart</button>
        </form>
        <form action="ShoppingServlet.do" method="Post">
            Cap R30: <input type="number" name="qty">
            <button type="Submit" name="product" value="cap">Add to cart</button>
        </form>
        <form action="ShoppingServlet.do" method="Post">
            Shoes R50: <input type="number" name="qty">
            <button type="Submit" name="product" value="shoe">Add to cart</button>
        </form>
        <form action="paymentServlet.do" method="Post">
            <button type="Submit" >Make Payment</button>
        </form>
    </body>
</html>
