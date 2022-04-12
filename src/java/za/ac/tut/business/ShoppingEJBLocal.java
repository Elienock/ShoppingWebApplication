/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.item.Item;

/**
 *
 * @author lubay
 */
@Local
public interface ShoppingEJBLocal {

    List<Item> listOfProducts(HttpSession session);

    Double determineAmountDue(HttpSession session);
    
}
