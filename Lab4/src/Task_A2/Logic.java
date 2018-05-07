/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_A2;

public class Logic {
    
    public static boolean isPalyndrome (int number) {
        int units = number % 10;
        int tenth = number % 100 / 10;
        int hundreds = number % 1000 / 100;
        int thousands = number / 1000;
        
        System.out.println("units: " + units);
        System.out.println("tenth: " + tenth);
        System.out.println("hundreds: " + hundreds);
        System.out.println("thousands: " + thousands);
    
        return (units == thousands && tenth == hundreds);
    }
}
