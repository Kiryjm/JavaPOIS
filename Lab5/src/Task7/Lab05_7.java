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
public class Lab05_7 {
    
    public static void main(String[] args) {
        
        System.out.println(119%100);
        View.print("*** The name of the number as a string ***");
        int number = UserInput.input("Input number: ");
        
        View.print("The number as a string: " + 
                NumberToWordTranslationLogic.getWord(number));
        
    }
    
}
