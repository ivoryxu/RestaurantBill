/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantbill;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price=14.98,taxes,total;
         taxes=0.13*price;
        
         total=price+taxes;
         System.out.println("Restaurant Bill"+"\n***************"+"\nMeal: "+price);
         DecimalFormat h=new DecimalFormat("###.##");
        System.out.println("HST:"+h.format(taxes));
        DecimalFormat x=new DecimalFormat("###.##");
        System.out.println("Total:"+x.format(total));
    
        System.out.println(" ");
        System.out.println("Log of Total: "+Math.log(total));
        System.out.println("Lager value of total and price: "+Math.max(price, total));
        System.out.println("Price with power Total: "+Math.pow(price, total));

    }
    
}
