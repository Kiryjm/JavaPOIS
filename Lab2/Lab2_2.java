/*
			Лабораторная работа №2.2

Разработать интерактивную программу «What is My Age in Seconds (Minutes,
Hours, …)», которая спрашивает дату рождения пользователя, высчитывает ко-
личество прожитых пользователем секунд (минут, часов, …) и выводит резуль-
тат на экран монитора.


*/

import java.util.*; //импортируем утилитный класс java для использования класса Scanner для ввода/вывода
import java.lang.*; // импортируем системный класс java для использования объектов in, out, err  
import java.text.*; // импортируем класс работы с датами, текстом, числами и обмена сообщениями независимо от естественного языка

public class Lab2_2
{  

    public static void main(String args[])
    {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date currentDate = new Date();
        Date birthDate = new Date();
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату вашего рождения:");
        String date = scanner.nextLine();
                
        try {

             birthDate = dateFormat.parse(date);
        } catch(Exception e) {
            System.out.println(e);
        }

	long lifeTime = lifeTime (currentDate, birthDate);

    System.out.println("Ваш день рождения: " + birthDate);
	System.out.println("Сегодня: " + currentDate);
	System.out.println("Вы живете " + lifeTimeInYears(lifeTime) + " лет!");
	System.out.println("Вы живете " + lifeTimeInDays(lifeTime) + " дней!");
	System.out.println("Вы живете " + lifeTimeInHours(lifeTime) + " часов!");
	System.out.println("Вы живете " + lifeTimeInMinutes(lifeTime) + " минут!");
	System.out.println("Вы живете " + lifeTimeInSeconds(lifeTime) + " секунд!");

    }

	public static long lifeTimeInYears(long lifeTime) {
	
		return lifeTime/1000/60/60/24/365;		
	}

	public static long lifeTimeInDays(long lifeTime) {
	
		return lifeTime/1000/60/60/24;		
	}

	public static long lifeTimeInHours(long lifeTime) {
	
		return lifeTime/1000/60/60;		
	}

	public static long lifeTimeInMinutes(long lifeTime) {
	
		return lifeTime/1000/60;		
	}

	public static long lifeTimeInSeconds(long lifeTime) {
	
		return lifeTime/1000;		
	}

	public static long lifeTime(Date today, Date birthday) {
	
		return today.getTime() - birthday.getTime();
	}

}