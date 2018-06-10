/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author Kirill
 */
public class Dragon {
    
    private static final int HEAD_COEFF_BEFORE_200 = 3;
    private static final int HEAD_COEFF_AFTER_200 = 2;
    private static final int HEAD_COEFF_AFTER_300 = 1;
    private static final int EYES_COEFF = 2;
    private static final int FIRST_AGE = 200;
    private static final int SECOND_AGE = 300;
    
    public static int dragonHeads(int year) {
        int heads = 0;
        
        if (year <= FIRST_AGE) {
            heads = year * HEAD_COEFF_BEFORE_200;
            
        } else if (year <= SECOND_AGE && year > FIRST_AGE){
            heads = FIRST_AGE * HEAD_COEFF_BEFORE_200 + 
                    (year - FIRST_AGE) * HEAD_COEFF_AFTER_200;
        
        } else if (year > SECOND_AGE){
            heads = FIRST_AGE * HEAD_COEFF_BEFORE_200 + 
                    (SECOND_AGE-FIRST_AGE) * HEAD_COEFF_AFTER_200 + 
                    (year - (FIRST_AGE + SECOND_AGE)) * HEAD_COEFF_AFTER_300;
            
        }
        return heads;
    }
        public static int dragonEyes(int heads) {
          return heads * EYES_COEFF;  
        
    }
        
}
