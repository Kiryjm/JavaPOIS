/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_C1;

/**
 *
 * @author Kirill
 */
public class TemperatureCalculator {
    public static double convertFromCelsiusToFahrenheit (double temperature) {
        return temperature * 9 / 5 + 32;
        
    }
    
    public static double convertFromFahrenheitToCelsius (double temperature) {
        return (temperature - 32) * 5 / 9;
    
    }
    
}
