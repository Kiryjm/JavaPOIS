/*
Написать программу определения соответствующего столетия для заданного
года (целое положительное число), учитывая, что, к примеру, началом XX сто-
летия был 1901 год.
 */
package Task_B1;

/**
 *
 * @author Kirill
 */
public class Lab04B1 {
    
    public static void main(String[] args) {
        int year = 1723;
    
    System.out.println("Year " + year + " is the " + Logic.identifyCentury(year)
            + "th century.");
        
    }
}
