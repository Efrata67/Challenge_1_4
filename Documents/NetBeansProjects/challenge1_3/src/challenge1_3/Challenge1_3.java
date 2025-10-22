
package Challenge1_3;

import java.util.Random;
import java.util.Scanner;

public class Challenge1_3 {

    public static void main(String[] args) {
        
        int health = 100;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for (int room = 1; room <= 5; room++) {
            System.out.println("Entering room " + room + "...");
            
            int event = rand.nextInt(3) + 1;
            

            switch (event) {
                case 1: // Trap
                    health -= 20;
                    System.out.println("A trap sprung! Health is now " + health + ".");
                    break;
                case 2: // Healing potion
                    health += 15;
                    if (health > 100) {
                        health = 100; // Cap health at 100
                    }
                    System.out.println("You found a healing potion! Health is now " + health + ".");
                    break;
                case 3: // Monster
                    int correctGuess = rand.nextInt(5) + 1; // Random number between 1 and 5
                    int playerGuess;
                    System.out.println("A monster appears! Guess a number (1-5) to defeat it: ");
                    do {
                        playerGuess = scanner.nextInt();
                        if (playerGuess != correctGuess) {
                            System.out.println("Wrong! Try again: ");
                        }
                    } while (playerGuess != correctGuess);
                    System.out.println("You defeated the monster!");
                    break;
            }
            
 
            if (health <= 0) {
                System.out.println("You have been defeated in room " + room + ".");
                scanner.close();
                return; // Exit the program
            }
        }
        

        System.out.println("You cleared the dungeon! Victorious with " + health + " health!");
        scanner.close();
    }
}

    

