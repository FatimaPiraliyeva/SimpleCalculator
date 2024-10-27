package my.company.simplecalculator; 

import java.text.DecimalFormat;
import java.util.Scanner; 
import java.util.InputMismatchException;


public class SimpleCalculator {

    public static void main(String[] args) {
        
        runCalculator();
                
    }
    public static void runCalculator (){
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println("Simple Arithmetic Calculator");
        System.out.println("--------------------");
        System.out.println("Please choose an option:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");    
        
        Scanner myObj = new Scanner(System.in); 
        double userInput = 0;
        boolean validInput = false;

        while (!validInput) {            
            try {
                userInput = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
        
        switch (userInput) {
            case (double)1 : {
                System.out.println("Enter the first number (a):");
                double a=0;
                validInput=false;
                while (!validInput) {            
            try {
                a = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                System.out.println("Enter the first number (b):");
                double b=0;
                validInput=false;
                while (!validInput) {            
            try {
                b = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                double c=a+b;
                System.out.println("Result: "+format.format(c));
                runCalculator();
                break;
            }
            case (double)2 : { 
                System.out.println("Enter the first number (a):");
                double a = 0;
                validInput=false;
                while (!validInput) {            
            try {
                a = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                System.out.println("Enter the first number (b):");
                double b = 0;
                validInput=false;
                while (!validInput) {            
            try {
                b = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                double c = a-b;
                System.out.println("Result: "+format.format(c));
                runCalculator();
                break;
            }
            case (double)3 : { 
                System.out.println("Enter the first number (a):");
                double a = 0;
                validInput=false;
                while (!validInput) {            
            try {
                a = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                System.out.println("Enter the first number (b):");
                double b = 0;
                validInput=false;
                while (!validInput) {            
            try {
                b= myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                double c = a*b;
                System.out.println("Result: "+format.format(c));
                runCalculator();
                break;
            }
            case (double)4 : {
                System.out.println("Enter the first number (a):");
                double a = 0;
                validInput=false;
                while (!validInput) {            
            try {
                a = myObj.nextDouble();  // Attempt to read a floating-point number
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                System.out.println("Enter the first number (b):");
                double b = 0;
                validInput=false;
                while (!validInput) {            
            try {
                b = myObj.nextDouble();  // Attempt to read a floating-point number
                if(b==0){
                       throw new ArithmeticException();                 
                }
                validInput = true;  // Exit loop if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine();  // Clear the invalid input
            }catch(ArithmeticException e){
                System.out.println("""
                                                           Error: Division by zero is not allowed. Please enter a non-zero
                                                           divisor.""");
                myObj.nextLine();  // Clear the invalid input
            }
        }
                 
                double c = a/b;
                System.out.println("Result: "+format.format(c));
                runCalculator();
                break;
            }
            case (double)5 :{
                System.exit(0);
             
            }
        default : {
                System.out.println("Invalid selection. Please choose a number from 1 to 5.");
                runCalculator();
            }
        }
        
    };
    
            
            
}
