package com.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//g
import java.util.InputMismatchException;
import java.util.Scanner;
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public App()
    {

    }
    public static void main(String[] args) 
    {
        App calculator = new App();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int choice;
            System.out.println("Enter the operation that you want to perform");
            System.out.println("Press 1 to find sum\nPress 2 to find difference\nPress 3 to find product\nPress 4 to find the quotient\nPress 5 to find square root\nPress 6 to Factorial\nPress 7 to Natural Log\nPress 8 to Power\n" +
            "Press any other key to exit\nEnter your choice: ");
            try
            {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException error) 
            {
                System.out.println("Thank you for using the calculator");
                scanner.close();
                return;
            }
            double num;
            int num1;
            switch (choice) 
            {
                case 1:
                    int n;
                    try
                    {
                        System.out.println("Enter the number of elements you want to add");
                        n = scanner.nextInt();
                    }
                    catch(InputMismatchException error)
                    {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    double[] numbers = new double[n];
                    System.out.println("Enter the numbers");
                    for (int i = 0; i < n; i++) 
                    {
                        try
                        {
                            numbers[i] = scanner.nextDouble();
                        }
                        catch(InputMismatchException error)
                        {
                            logger.error("Invalid input, Entered input is not a number");
                            scanner.close();
                            return;
                        }
                    }
                    System.out.println("================================================");
                    System.out.println("Sum is : " + calculator.addition(numbers));
                    System.out.println("================================================");
                    break;
                case 2:
                    double a,b;
                    try 
                    {
                        System.out.print("Enter the first number : ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        b = scanner.nextInt();
                    } 
                    catch (InputMismatchException error) 
                    {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Difference is : " + calculator.subtraction(a, b));
                    System.out.println("================================================");
                    break;
                case 3:
                    try 
                    {
                        System.out.print("Enter the number of elements you want to multiply : ");
                        n = scanner.nextInt();
                    } 
                    catch (InputMismatchException error) 
                    {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    numbers = new double[n];
                    System.out.println("Enter the numbers");
                    for (int i = 0; i < n; i++) 
                    {
                        try 
                        {
                            numbers[i] = scanner.nextDouble();
                        } 
                        catch (InputMismatchException error) 
                        {
                            logger.error("Invalid input, Entered input is not a number");
                            scanner.close();
                            return;
                        }
                    }
                    System.out.println("================================================");
                    System.out.println("Product is : " + calculator.multiplication(numbers));
                    System.out.println("================================================");
                    break;
                case 4:
                    try 
                    {
                        System.out.print("Enter the first number : ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        b = scanner.nextInt();
                    } 
                    catch (InputMismatchException error) 
                    {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Quotient is : " + calculator.division(a, b));
                    System.out.println("================================================");
                    break;
                case 5:
                    try 
                    {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } 
                    catch (InputMismatchException error) 
                    {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Square root is: " + calculator.squareRoot(num));
                    System.out.println("================================================");
                    break;
                case 6:
                    try {
                        System.out.print("Enter the number : ");
                        num1 = scanner.nextInt();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Factorial of a number is : " + calculator.factorial(num1));
                    System.out.println("================================================");
                    break;
                case 7:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Natural log is : " + calculator.naturalLog(num));
                    System.out.println("================================================");
                    break;
                case 8:
                    double num2;
                    try {
                        System.out.print("Enter the first number : ");
                        num = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        scanner.close();
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Power result is : " + calculator.power(num, num2));
                    System.out.println("================================================");
                    break;
                default:
                    System.out.println("Thank you for using the calculator");
                    scanner.close();
                    return;
            }
        }

    }

    public double addition(double[] numbers) 
    {
        double sum = 0;
        logger.info("Calculating sum of numbers");
        for (double number : numbers) 
        {
            sum += number;
        }
        logger.info("Result of addition is : " + sum);
        return sum;
    }
    public double subtraction(double num1, double num2) 
    {
        double result;
        logger.info("Calculating difference of two numbers " + num1 + " and " + num2);
        result = num1 - num2;
        logger.info("Result of subtraction is : " + result);
        return result;
    }
    public double multiplication(double[] numbers) 
    {
        double product = 1;
        logger.info("Calculating product of numbers");
        for (double number : numbers) 
        {
            product *= number;
        }
        logger.info("Result of multiplication is : " + product);
        return product;
    }
    public double division(double num1, double num2) 
    {
        double result;
        logger.info("Calculating division of two numbers " + num1 + " and " + num2);
        result = num1 / num2;
        logger.info("Result of division is : " + result);
        return result;
    }
    public double power(double num, double num2) {
        double result;
        logger.info("Calculating Power  of two numbers " + num + " and " + num2);
        result = Math.pow(num, num2);
        logger.info("Result of power is : " + result);
        return result;
    }

    public double naturalLog(double num) {
        double result = 0;
        try{
            logger.info("Calculating Natural log of " + num);
            if(num <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN log of <= 0");
            }
            else{
                result = Math.log(num);
            }
        }
        catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of naturalLog is : " + result);
        }
        return result;
    }

    public double factorial(double num) {
        double result = 1;
        try{
            if(num != (int)num){
                result = Double.NaN;
            }

            if(num < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN factorial if < 0");
            }

            if(num == 0 || num == 1) return 1;

            for(int i = 1; i <= num; i++){
                result *= i;
            }
        }
        catch(ArithmeticException err) {
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of factorial is: " + result);
        }

        return result;
    }

    public double squareRoot(double num) {
        double result = 0;
        try{
            logger.info("Calculating Square root  of number " + num);
            if(num < 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN squareRoot of < 0");
            }
            else{
                result = Math.sqrt(num);
            }
        }catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }finally {
            logger.info("Result of squareRoot is : " + result);
        }

        return result;
    }
}
