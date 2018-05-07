/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_B1;

/**
 *
 * @author Kirill
 */
public class Logic {
    
    public static int identifyCentury(int year) {
        int century = (year % 100 > 0) ? year / 100 + 1 : year / 100;
        return century;
    
    }
}
