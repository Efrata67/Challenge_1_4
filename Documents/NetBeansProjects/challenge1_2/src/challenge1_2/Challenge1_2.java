
package challenge1_2;


public class Challenge1_2 {

   public static void main(String[] args) {

        String[] winningNumbers = {"22-24-62-78-50", "22-88-90-40-23", "33-45-06-55-63"};
        
        double highestAverage = -1;
        String highestAverageNumber = "";
        
        for (String number : winningNumbers) {

            String cleanNumber = number.replace("-", "");
            
            int[] digits = new int[cleanNumber.length()];
            for (int i = 0; i < cleanNumber.length(); i++) {
                digits[i] = Character.getNumericValue(cleanNumber.toCharArray()[i]);
            }
            

            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            

            double average = (double) sum / digits.length;
            
            System.out.println("Analyzing: " + number);
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);
            

            if (average > highestAverage) {
                highestAverage = average;
                highestAverageNumber = number;
            }
        }
        
        System.out.println("The winning number with the highest average is: " + 
                           highestAverageNumber + " with an average of " + highestAverage);
    }
    
}
