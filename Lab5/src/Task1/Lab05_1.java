/*
В молодом возрасте дракон каждый год отращивает по три головы, но после
того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
одной. Разработайте программу, которая высчитывала бы, сколько голов и
глаз у дракона, которому N лет?
 */
package Task1;

import java.util.Scanner;

public class Lab05_1 {
    
    public static void main(String[] args) {
        
        int N;
        int heads;
        
        N = UserInput.input("Enter dragon's age: ");
        heads = Dragon.dragonHeads(N);
        
        View.print("Dragon has " + Dragon.dragonHeads(N) + " heads and " 
                + Dragon.dragonEyes(heads) + " eyes");
    }
}
