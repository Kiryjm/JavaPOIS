/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_B2;

/**
 *
 * @author Kirill
 */
public class Logic {
    public static int reverseNumber(int number) {
        int units = number % 10;
        int tenth = number % 100 / 10;
        int hundreds = number % 1000 / 100;
        int thousands = number / 1000;
        
        return units*1000 + tenth*100 + hundreds*10 + thousands;
    
    }
}
