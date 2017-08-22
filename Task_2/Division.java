/**
 * This class is designed to divide two numbers
 */
public class Division {
    public static void main(String[] args) {
        //If the number of arguments is less than 2
        if(args.length<2) {
            System.out.println("two arguments needed");
            return;
        }
            double a=0, b=0;
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);

            } catch (Exception e) {
		// If arguments are not numbers
                System.out.println("Arguments must be numbers ");
                return;
            }
        // If denominator is 0
            if(b==0.0) {
                System.out.println("Denominator can't be zero");
                return;
            }
            // Display the result
            System.out.println("Result is " + (a / b));

        }
    }

