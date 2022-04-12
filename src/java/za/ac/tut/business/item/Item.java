/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business.item;

import java.util.List;
import javax.servlet.http.HttpSession;
import static za.ac.tut.business.iteminterface.ItemInterface.CAP_PRICE;
import static za.ac.tut.business.iteminterface.ItemInterface.SHOE_PRICE;
import static za.ac.tut.business.iteminterface.ItemInterface.SOCK_PRICE;

/**
 *
 * @author lubay
 */
public class Item {
   private Integer qty;
   private String productName;

    public Item(Integer qty, String productName) {
        this.qty = qty;
        this.productName = productName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
   
 public Double amountDue(){
    String productName = getProductName();
    int qty= getQty();
    Double amountDue=0.00;
    
       switch (productName) {
           case "sock":
               amountDue = qty * SOCK_PRICE;
               break;
           case "cap":
               amountDue = qty * CAP_PRICE;
               break;
           default:
               amountDue = qty * SHOE_PRICE;
               break;
       }
     return amountDue;
 }  
    
}
