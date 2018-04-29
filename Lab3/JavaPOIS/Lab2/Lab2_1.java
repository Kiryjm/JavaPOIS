/*
			Лабораторная работа №2.1

Необходимо спроектировать и разработать простейшее интерактивное
приложение, которое бы спрашивала у пользователя соответствующую ин-
формацию о нём (к примеру, дату рождения, где работает, кем работает, хобби
и увлечения, любимый афоризм или лозунг, семейное положение, сколько в
день работает, отдыхает и т.д.), а затем выводит всю введённую пользователем
информацию в табличном виде на экран монитора.


*/

import java.util.*; //импортируем утилитный класс java для использования класса Scanner для ввода/вывода
import java.lang.*; // импортируем системный класс java для использования объектов in, out, err

public class Lab2_1
{  
    public static void main(String args[])
    {	
     
	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите дату рождения:");
        String birthDate = scanner.nextLine();
        
        System.out.println("Введите место работы:");
        String workPlace = scanner.nextLine();
        
        System.out.println("Введите род деятельности:");
        String occup = scanner.nextLine();
        
        System.out.println("Какое у вас хобби:");
        String hobby = scanner.nextLine();
        
        System.out.println("Скажите что-нибудь умное:");
        String motto = scanner.nextLine();
        
        System.out.println("Семейное положение:");
        String familyStatus = scanner.nextLine();
        
        System.out.println("Cколько часов вы работаете:");
        int workTime = scanner.nextInt();
        
        System.out.println("Сколько часов вы отдыхаете:");
        int relaxTime = scanner.nextInt();
		
	System.out.printf("\n\n%4s\n", "Дата рождения:\t\t" + birthDate);
	System.out.printf("%4s\n", "Место работы:\t\t" + workPlace);
	System.out.printf("%4s\n", "Род деятельности:\t" + occup);
	System.out.printf("%4s\n", "Хобби:\t\t\t" + hobby);
	System.out.printf("%4s\n", "Девиз:\t\t\t" + motto);
	System.out.printf("%4s\n", "Семейное положение:\t" + familyStatus);
	System.out.printf("Время на работе:\t%d \n", workTime);
	System.out.printf("Время на отдых:\t\t%d \n", relaxTime);
    }
}


