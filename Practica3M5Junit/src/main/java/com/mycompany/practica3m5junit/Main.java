
package com.mycompany.practica3m5junit;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodri
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("INVERTIR");
        System.out.println(MyUtils.inverteix("Hola mundo"));
        System.out.println(MyUtils.inverteix(null));
        System.out.println("-------------------");
        
        System.out.println("EDAD");
        try {
            System.out.println(MyUtils.edat(20,4,2005));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(MyUtils.edat(1,4,2025));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(MyUtils.edat(20,4,1500));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-------------------");
        
        System.out.println("FACTORIAL");
        System.out.println(MyUtils.factorial(5));
        System.out.println(MyUtils.factorial(0));
        System.out.println(MyUtils.factorial(-14));
        System.out.println("-------------------");
    }
    
}
