/**
 * This class is designed to divide two numbers
 */
public class Division {
    public static void main(String[] args) {
        // Проверить число аргументов
        if(args.length<2) {
            System.out.println("two arguments needed");
            return;
        }
            double a=0, b=0;
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);

            } catch (Exception e) {
                System.out.println("Arguments must be numbers ");
                return;
            }
        // Если знаменатель равен нулю
            if(b==0.0) {
                System.out.println("Denominator can't be zero");
                return;
            }
            System.out.println("Result is " + (a / b));

        }
    }

