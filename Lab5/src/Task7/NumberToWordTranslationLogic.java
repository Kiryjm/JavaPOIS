/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

/**
 *
 * @author Kirill
 */
public class NumberToWordTranslationLogic {
    
    static final String[] HUNDREDS = {"", "one hundred ", "two hundred ", 
        "three hundreed ", "four hundred ", "five hundred ", 
        "six hundred ", "seven hundred ", "eight hundred ", 
        "nine hundred "};
    
    static final String[] TENS = {"", "ten " ,"twenty ", "thirty ", 
        "fourty ", "fifty ", "sixty ", "seventy ", 
        "eighty ", "ninety "};
    
    static final String[] FROM_11_TO_19_TENS = {"eleven", "twelve", 
        "thirteen", "fourteen", "fifteen", "sixteen", 
        "seventeen", "eighteen", "nineteen"};
    
    static final String[] DIGITS = {"", "one", "two", "three", 
    "four", "five", "six", "seven", "eight", "nine"};
    
    
    public static String getWord(int number) {
        String result = null;
        
        result = HUNDREDS[number/100];
        
        if (number%100 > 10 && number%100 < 20) {
            
            result += FROM_11_TO_19_TENS[number%100 - 11];
        
        } else {
            
            result += TENS[number%100/10];
            result += DIGITS[number%10];
        }
        
        return result;
    }
    
}
