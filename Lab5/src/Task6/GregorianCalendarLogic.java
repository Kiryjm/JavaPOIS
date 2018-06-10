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
public class GregorianCalendarLogic {
    
    public static String getNextDate(int day, int month, int year) {
        
        if ((day < 1) || (day > 31) || (month < 1) || (month > 12) || 
                ((day > 30) && ((month == 4) || (month == 6) || (month == 9) 
                || (month == 11) ))) {
            
            View.print("Error. Such date doesn't exist!");
            return "unreachable";
        }
        
        if ((day == 31) && (month == 12)) {
            
            day = 1;
            month = 1;
            year++;
        }
        
        else if (( (day > 30) && ((month == 1) || (month == 3) || (month == 5) 
                || (month == 7) || (month == 8) || (month == 8) || (month == 10) 
                || (month == 12)) || (day > 29)) && 
                ((month == 4) || (month == 6) || (month == 9) || (month == 11) )) {
            
            day = 1;
            month++;
            
        }
        
        else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            
            if ((month == 2) && (day > 29)) {
                
                View.print("Error. Such date doesn't exist!");
                return "unreachable";
            
            }
            
            else if (day > 28) {
                
                day = 1;
                month++;
            
            }
            
            else day++;

        }
        
        else if (day > 28 && month == 2) {
            
            View.print("Error. Such date doesn't exist!");
            return "unreachable";
        
        }
        
        else if (day > 27 && month == 2) {
            
             day = 1;
             month++;
             
        }
        
        else day++;
        
        return Integer.toString(day) + "." + Integer.toString(month) + "." +
                Integer.toString(year);
            
    }
    
}
