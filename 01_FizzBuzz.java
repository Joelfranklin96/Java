// Write a program which outputs "Fizz" if the input number is divisible by 5,
// outputs "Buzz" if the input number is divisible by 3,
// outputs "FizzBuzz" if the input number is divisible by both 3 and 5,
// and outputs the number if the input number is neither divisible by 5 nor 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {

            if (number % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }
}