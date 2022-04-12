/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.item.Item;

/**
 *
 * @author lubay
 */
@Stateless
public class ShoppingEJB implements ShoppingEJBLocal {
   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Item> listOfProducts(HttpSession session) {
        List<Item> items = (List) session.getAttribute("items");
        
        return items;
    }

    @Override
    public Double determineAmountDue(HttpSession session) {
      Double totalAmountDue=0.00;
    }
    
}
