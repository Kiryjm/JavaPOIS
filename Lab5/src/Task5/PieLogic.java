/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

/**
 *
 * @author Kirill
 */
import java.util.Random;

public class PieLogic {
    
    static final String[] PIE_FILLING = {"cranberry", "strawberry", "cherry", 
        "blackberry", "apple", "raisin", "pumpkin", "salmon", "prediction", 
        "no"};
    
   
    public static int getRandomFilling () {
        
        return new Random().nextInt(PIE_FILLING.length);
    }
    
    
    public static String getPie () {
        
        return PIE_FILLING[getRandomFilling()];
    }
    
}
