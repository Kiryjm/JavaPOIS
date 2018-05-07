/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_C2;

/**
 *
 * @author Kirill
 */
public class Swap {
    public static void swapVariables (int a, int b) {
        a = a ^ b;
        b = a ^ b;        
        a = a ^ b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
