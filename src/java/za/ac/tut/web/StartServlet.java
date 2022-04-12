/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.item.Item;

/**
 *
 * @author lubay
 */
public class StartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        //create a session
        HttpSession session = request.getSession(true);
        
        //we get the parameters
        String name = request.getParameter("name");
        
        //initialise the session
        initialiseSession(session,name);
        
        //send it to a jsp
        RequestDispatcher disp = request.getRequestDispatcher("shopping.jsp");
        disp.forward(request, response);
    }

    private void initialiseSession(HttpSession session, String name) {
        List<Item> items = new ArrayList<>();
        Double totalAmountDue=0.00;
        
      session.setAttribute("name", name);
      session.setAttribute("items", items);
      session.setAttribute("totalAmountDue", totalAmountDue);
    }

}
