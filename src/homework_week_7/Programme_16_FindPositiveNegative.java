package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_FindPositiveNegative{
    public static void main(String[] args) {
        //Scanner declaration for reading from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int number =scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
    }

    //Finding the number is Positive , negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if(number>0){
            System.out.println(number+" is a Positive number");
        }else if(number<0){
            System.out.println(number + " is a Negative number");
        }else{
            System.out.println(number+" is Zero");
        }
    }
}
