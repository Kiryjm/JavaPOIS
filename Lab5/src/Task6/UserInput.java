/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

/**
 *
 * @author Kirill
 */
import java.util.Scanner;

public class UserInput {
    
    private static Scanner scanner= new Scanner(System.in);
    
    public static int input(String msg) {
        
        System.out.println(msg);
        return scanner.nextInt();
        
    }
    
}
