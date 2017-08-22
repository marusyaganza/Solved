/**
 * This class is designed to calculate the sum of two arguments
 */
public class Summation {
    public static void main(String[] args) {
        // Проверить число аргументов
        if(args.length<2) {
            System.out.println("two arguments needed");
            return;
        }
        // Если хотя бы один аргумент - действителькое число
        if(args[0].contains(".")||args[1].contains(".")) {
            double a=0, b=0;
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
            } catch (Exception e) {
                System.out.println("Arguments must be numbers ");
                return;
            }
            // Вывести на экран результат
            System.out.println("Sum is " + (a + b));

        }
        else{
            int a = 0, b = 0;
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (Exception e) {
                System.out.println("Arguments must be numbers ");
                return;
            }
            System.out.println("Sum is " + (a + b));

        }
    }
}
