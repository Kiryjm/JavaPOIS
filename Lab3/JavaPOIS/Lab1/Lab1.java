/*
			Лабораторная работа №1

Создать простейшее приложение, которое выводит в окне консоли в таблич-
ном виде следующую информацию: Ф.И.О. студента, номер группы, основной
вид деятельности, увлечения.


*/
import java.lang.System; // импортируем системный класс java

class Lab1
{  
    public static void main(String args[])
    {
		
		System.out.printf("ФИО\t%37s", "Пузанов Кирилл Владимирович\n");
		System.out.printf("Номер группы\t%12s", "ПОИС1709в1\n");
		System.out.printf("Вид деятельности %2s", "инженер-программист\n");
		System.out.printf("Увлечения\t%8s", "Гитара\n");
    }
}


