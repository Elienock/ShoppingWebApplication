/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.ShoppingEJBLocal;
import za.ac.tut.business.item.Item;

/**
 *
 * @author lubay
 */
public class ShoppingServlet extends HttpServlet {

    @EJB
    private ShoppingEJBLocal shoppingEJB;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get the session
        HttpSession session = request.getSession();
        
        //get the parameters
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        String product = request.getParameter("product");
        
        Item item = new Item(qty,product);
        
        //get the list from the session
        List<Item>items =shoppingEJB.listOfProducts(session);
        
        items.add(item);
        
        //we have to update the session
        updateSessionList(session,items);
        
        //send it to it back to the shopping.jsp
        RequestDispatcher disp = request.getRequestDispatcher("shopping.jsp");
        disp.forward(request, response);
    }

    private void updateSessionList(HttpSession session, List<Item> items) {
       session.setAttribute("items", items);
    }

}
