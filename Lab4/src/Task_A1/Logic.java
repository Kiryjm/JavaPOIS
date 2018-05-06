/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_A1;

public class Logic {

    public static boolean inRectangle (double x, double y, 
            double upperLeftAngleX, double upperLeftAngleY, 
            double lowerRightAngleX,
            double lowerRightAngleY) {
    
        return ((x < lowerRightAngleX && x > upperLeftAngleX) && (y < upperLeftAngleY && y > lowerRightAngleX) );
    
    }
 
}
