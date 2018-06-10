/*
Напишите программу – симулятор пирожков с «сюрпризом». Программа
должна выводить пирожок и один из пяти (можно больше) различных «сюр-
призов», который бы выбирался случайным образом.
 */
package Task5;

/**
 *
 * @author Kirill
 */
public class Lab05_5 {
    
    public static void main(String[] args) {
        
        View.print("You've got a pie with " + PieLogic.getPie() + " filling!");
        
    }
}