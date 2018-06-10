/*
Напишите программу «Mood Sensor» (эмулировать датчика настроения), кото-
рая «залазит» в душу пользователя и определяет его настроение в текущий
момент времени. Приложение будет генерировать случайное число, в зави-
симости от значения которого на экран выводится одно из псевдографических
«лиц», которое и будет отображать настроение пользователя.
 */
package Task4;


public class Lab05_4 {
    public static void main(String[] args) {
       
       char Letter = UserInput.input("Enter a letter: ");
       View.print("Method 1: Letter " + Letter + " " + LetterLogic.isConsonantOrVowelFirstMethod(Letter));
       View.print("Method 2: Letter " + Letter + " " + LetterLogic.isConsonantOrVowelSecondMethod(Letter));
       View.print("Method 3: Letter " + Letter + " " + LetterLogic.isConsonantOrVowelThirdMethod(Letter));
       View.print("Method 4: Letter " + Letter + " " + LetterLogic.isConsonantOrVowelFourthMethod(Letter));
        
    }
}
