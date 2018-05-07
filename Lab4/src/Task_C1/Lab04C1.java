/*
 Разработать программу перевода температуры из градусов Цельсия в градусы
Фаренгейта и наоборот.
 */
package Task_C1;

/**
 *
 * @author Kirill
 */
public class Lab04C1 {
    public static void main(String[] args) {
        double temperature = 100;
        
        System.out.println("Temperature " + temperature + 
                " degrees in Celsius = " + 
                TemperatureCalculator.convertFromCelsiusToFahrenheit(temperature)
                + " degrees in Fahrenheit" );
        
        System.out.println("Temperature " + temperature + 
                " degrees in Fahrenheit = " + 
                TemperatureCalculator.convertFromFahrenheitToCelsius(temperature) 
                + " degrees in Celsius" );
        
    }
}
