/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Random;

public class MoodSensor {
    
    public static final String[] EMOTIKON = {"\uD83D\uDE04", "\ud83d\ude0a", 
        "\uD83D\uDE14", "\uD83D\uDE24", "\uD83D\uDE04", "\uD83D\uDE1A", 
        "\uD83D\uDE37", "\uD83D\uDE36", "\uD83D\uDE35", "\uD83D\uDE33", 
        "\uD83D\uDE32", "\uD83D\uDE31", "\uD83D\uDE30", "\uD83D\uDE2D", 
        "\uD83D\uDE2B", "\uD83D\uDE2A", "\uD83D\uDE28"};
    
    public static int getMoodNumber() {
        return new Random().nextInt(EMOTIKON.length);
    
    }
    
    public static String getCurrentMood() {
        return EMOTIKON[getMoodNumber()];
    
    }
}
