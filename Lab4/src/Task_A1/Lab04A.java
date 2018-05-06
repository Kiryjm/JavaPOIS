package Task_A1;

/*
 Задание А. Разработайте программу, которая проверяет, что точка с координатами 
(x, y)лежит внутри прямоугольника, левая верхняя вершина которого имеет коор-
динаты (x1, y1), правая нижняя – (x2, y2), а стороны параллельны координат-
ным осям.
 */

public class Lab04A {

    public static void main(String[] args) {
        
        double upperLeftAngleX = -14.5;
        double upperLeftAngleY = 101.2;
        double lowerRightAngleX = 9.3;
        double lowerRightAngleY = 1.7;
        double pointX = -10.48;
        double pointY = 25.85;
        
        System.out.println("Check, if point with coordinates (" 
                + pointX + ", " + pointY +")");
        System.out.println("lying into the rectangle");
        System.out.println("Result: " + 
                Logic.inRectangle(pointX, pointY, 
                upperLeftAngleX, upperLeftAngleY, 
                lowerRightAngleX, lowerRightAngleY));
    }
    
}
