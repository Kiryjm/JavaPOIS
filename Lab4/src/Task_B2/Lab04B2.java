/*
Написать программу, которая переворачивает (реверсирует) четырёхзначное
(пятизначного и т.д.) число N (к примеру, число 1234 реверсируется в число
4321).
 */
package Task_B2;

/**
 *
 * @author Kirill
 */
public class Lab04B2 {
    
    public static void main(String[] args) {
        int number = 1234;
        
        System.out.println("Reverse of number " + number + " is " + Logic.reverseNumber(number));
        
    }
}
