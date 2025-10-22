
package challenge_1_1;
import java.util.Scanner;

public class Challenge_1_1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int lastDigit = number % 10;
        
        int numDigits = (int) Math.floor(Math.log10(number)) + 1;
        
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        
        int secondDigit = (number / (int) Math.pow(10, numDigits - 2)) % 10;
        
        int secondLastDigit = (number / 10) % 10;
        
        int product = firstDigit * lastDigit;
        
        int sum = secondDigit + secondLastDigit;
        
        String decryptedCode = String.valueOf(product) + String.valueOf(sum);
        
        System.out.println("The decrypted code is: " + decryptedCode);
        
        scanner.close();
    }
}
