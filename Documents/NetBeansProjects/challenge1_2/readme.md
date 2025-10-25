**"Lottery Number Analyzer"**

**Project Overview**
Project Name: Chapter1_Challenge_1_2Scenario: You are tasked with analyzing a set of winning lottery numbers provided as strings in the format "XX-XX-XX-XX-XX". The goal is to process each number, calculate the sum and average of its digits, and identify the number with the highest average digit value.

**Challenge Description**
The program performs the following tasks:

Initializes an array of winning lottery numbers:String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};


For each number in the array:
Removes dashes to form a continuous string (e.g., "12-34-56-78-90" becomes "1234567890").
Converts the string into an array of integers (e.g., {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}).
Calculates the sum and average of the digits.


Identifies the winning number with the highest average digit value.
Outputs the analysis for each ticket and the number with the highest average.

**Expected Output:**
Analyzing: 12-34-56-78-90
Digit Sum: 45, Digit Average: 4.5
Analyzing: 33-44-11-66-22
Digit Sum: 30, Digit Average: 3.0
Analyzing: 01-02-03-04-05
Digit Sum: 15, Digit Average: 1.5
The winning number with the highest average is: 12-34-56-78-90 with an average of 4.5

**Requirements**

Java Version: JDK 8 or higher.
Dependencies: None (uses standard Java libraries: java.lang.String and java.lang.Character).
Input: A hardcoded array of lottery numbers in the format "XX-XX-XX-XX-XX".
Constraints: Must use both a for loop and a for-each loop, and methods String.replace(), String.toCharArray(), and Character.getNumericValue().

**How It Works**
The program:

Initializes the winningNumbers array with the specified lottery numbers.
Uses a for-each loop to iterate over each lottery number.
Removes dashes using String.replace("-", "").
Converts the cleaned string to an integer array using a for loop, String.toCharArray(), and Character.getNumericValue().
Calculates the sum of digits using a for-each loop and computes the average as a double.
Tracks the highest average and its corresponding number.
Prints the analysis for each number (sum and average) and the number with the highest average.


**Setup and Running Instructions**

Ensure Java is Installed:

Verify Java is installed by running java -version in your terminal.
Install JDK if needed (e.g., from Oracle).


Compile the Program:
javac Chapter1_Challenge_1_2.java


Run the Program:
java Chapter1_Challenge_1_2


**Output:**

The program will display the analysis for each lottery number and the number with the highest average digit value.



Example
Output:
Analyzing: 12-34-56-78-90
Digit Sum: 45, Digit Average: 4.5
Analyzing: 33-44-11-66-22
Digit Sum: 30, Digit Average: 3.0
Analyzing: 01-02-03-04-05
Digit Sum: 15, Digit Average: 1.5
The winning number with the highest average is: 12-34-56-78-90 with an average of 4.5

**Assumptions**

The input array is hardcoded and contains valid lottery numbers in the format "XX-XX-XX-XX-XX".
Each number string consists of digits and dashes, with no invalid characters.
The program assumes at least one number exists in the array.

