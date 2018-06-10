/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;



public class LetterLogic {
    
    public static String isConsonantOrVowelFirstMethod(char letter) {
        letter = Character.toLowerCase(letter);
        
        if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'y' ||
                letter == 'e' || letter == 'i') 
        {
            return "is vowel";
        } else 
        {
            return "is consonant";
        }
    }
    
    public static String isConsonantOrVowelSecondMethod(char letter) {
        letter = Character.toLowerCase(letter);
        
        switch(letter) {
            
            case 'a': 
            case 'o':
            case 'u':
            case 'y':
            case 'e':
            case 'i': 
                return "is vowel";
        }
        return "is consonant";
    }
    
    public static String isConsonantOrVowelThirdMethod(char letter) {
        letter = Character.toLowerCase(letter);
        
        if("AEYUIOaeyuio".contains(Character.toString(letter))) {
            return "is vowel";
            
        } else {
            return "is consonant";
        
        }
    }
    
    public static String isConsonantOrVowelFourthMethod(char letter) {
        letter = Character.toLowerCase(letter);
        
        if("AEYUIOaeyuo".indexOf(letter)== -1) {
            return "is consonant";
            
        } else {
            return "is vowel";
            
        }
    }
}

