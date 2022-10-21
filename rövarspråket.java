
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class rövarspråket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word to modify");
    String word = input.nextLine();
    String translate = "";
    word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            translate = translate + letter;
            if (letter != 'a' && letter != 'i' && letter != 'u' && letter != 'o' && letter != 'e'){
                translate = translate + "o" + letter;
            }
            
        }
        System.out.println(word + " is now " + translate);
    }
    
}
