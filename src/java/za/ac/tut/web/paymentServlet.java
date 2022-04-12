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
public class paymentServlet extends HttpServlet {

    @EJB
    private ShoppingEJBLocal shoppingEJB;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
       
        Double totalAmountDue = shoppingEJB.determineAmountDue(session);
        
        //we update the session with the new total amount due
        updateSessionWithAmountDue(session,totalAmountDue);
        
        RequestDispatcher disp = request.getRequestDispatcher("MakePayment.jsp");
        disp.forward(request, response);
        
    }

    private void updateSessionWithAmountDue(HttpSession session, Double totalAmountDue) {
       session.setAttribute("totalAmountDue", totalAmountDue);
    }

}
