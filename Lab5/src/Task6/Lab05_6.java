/*
Заданы три целых числа, которые задают некоторую дату по Грегорианскому
календарю. Определить дату следующего дня. Запрещается использовать типы 
стандартной библиотеки языка для работы с датой и временем.
 */
package Task6;

/**
 *
 * @author Kirill
 */
public class Lab05_6 {
    
    public static void main(String[] args) {
        
        View.print("Please, enter date ");
        int day = UserInput.input("Enter a day of date: ");
        int month = UserInput.input("Enter a month of date: ");
        int year = UserInput.input("Enter a year of date: ");
        
        View.print("Next date is " + GregorianCalendarLogic.getNextDate(day, month, year));
        
    }
    
}
