
package sumofstringdigits;
import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 * Assignment 5
 * 11/01/2020
 * Objective: Practice converting strings into arrays & string arrays into integer
 * arrays by writing a program that asks a user to input a series of numbers without spaces.
 * The program should display the sum of all numbers, the highest number & the lowest number. 
 */
public class SumOfStringDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String digits;
        String eachDigit;
        int sum=0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a series of numbers without spaces: ");
        digits = keyboard.nextLine();
        
        //create an array
        int digitArray[] = new int[digits.length()];
        
        //Convert the String into an integer array.
        for (int i=0; i < digits.length(); i++)
        {
            eachDigit = digits.substring(i, i + 1);
            digitArray[i] = Integer.parseInt(eachDigit);
            //find the sum of the digits
            sum = sum + digitArray[i];
        }
        //print the sum of the digits (adding them all together).
        System.out.println("\tThe sum of entered the numbers equal = " + sum);
        
        //find and print the maximum digit in the input.
        int max = digitArray[0];
        for(int i = 0; i < digits.length(); i++)
        {
            if(max < digitArray[i])
                max = digitArray[i];
        }
        System.out.println("\tThe highest digit is # " + max);
        
        //find and print the minimum digit in the input.
        int min = digitArray[0];
        for (int i = 0; i < digits.length(); i++)
        {
            if (min > digitArray[i])
                min = digitArray[i];
        }
        System.out.println("\tThe lowest digit is # " + min);
    }  
}
