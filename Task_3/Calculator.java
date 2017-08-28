import java.util.Scanner;

/**
 * This is calculator that supports operations: addition, subtraction, multiplication, division
 * and presenting result like this:
 * *** ***     * *
 *   *   *     * *
 * *** ***     ***
 * *     *       *
 * *** ***  *    *
 */

public class Calculator {
    public static void main(String[] args) {
        start();
    }
    // starts calculator
    public static void start(){
        System.out.println("Hi, I'm calculator");
        while (true) {
            Output.printNumber(calculations());
        }
    }
    static double calculations() {
        String garbage;
        int operation = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        //  operation input
            do {
                System.out.println("Please, chose operation:");
                System.out.println("1 - addition\n" +
                        "2 - subtraction\n" +
                        "3 - multiplication\n" +
                        "4 - division\n" +
                        "5 - quit");
                System.out.println();
                if (input.hasNextInt()) {
                    operation = input.nextInt();
                }
                // removing symbols from input
                else garbage = input.nextLine();
                // if operation is correct
                if (operation > 0 && operation < 6) {
                    break;
                } else {
                    System.out.println("Incorrect operation, please try again");
                }

            } while (true);
            //if quit
            if (operation == 5) {
                System.out.println("Goodbye");
                System.exit(0);
            }

            double num1 = 0.0;
            double num2 = 0.0;
            // first argument input
            do {
                System.out.println("Please, enter first argument");
                if (input.hasNextDouble()) {
                    num1 = input.nextDouble();
                    break;
                } else {
                    System.out.println("Incorrect argument, please try again");
                    garbage = input.nextLine();
                }
            } while (true);
            //second argument input
            do {
                flag = false;
                System.out.println("Please, enter second argument");
                if (input.hasNextDouble()) {
                    num2 = input.nextDouble();
                } else {
                    System.out.println("Incorrect argument, please try again");
                    garbage = input.nextLine();
                    flag = true;
                }
                // if denominator is 0
                if (operation == 4 && ((Double.isInfinite(num1 / num2))||(Double.isNaN(num1 / num2)))) {
                    System.out.println("Denominator can't be zero");
                    flag = true;
                }
            } while (flag);

            double result = 0.0;

            // calculate
            switch (operation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    return num1 / num2;
            }

            return result;
        }
    }


