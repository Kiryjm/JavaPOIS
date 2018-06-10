/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Random;

public class DiceLogic {
    public static final int EDGE_NUMBER = 6; 
            
    public static int playDice() {
        int first_dice = new Random().nextInt(EDGE_NUMBER + 1);
        int second_dice = new Random().nextInt(EDGE_NUMBER + 1);
        
        return first_dice + second_dice;
    }
}
