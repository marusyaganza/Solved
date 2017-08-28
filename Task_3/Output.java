/**
 * Created by marusyaganza on 28.08.2017.
 *This class is designed to print numbers using '*' and ' ' symbols
 */
public class Output {
    // Array of constants, holding digits
    private static final String[][] DIGITS =
            {
                    {"***", "* *", "* *", "* *", "***"},//0
                    {"*", "*", "*", "*", "*"},          //1
                    {"***", "  *", "***", "*  ", "***"},//2
                    {"***", "  *", "***", "  *", "***"},//3
                    {"* *", "* *", "***", "  *", "  *"},//4
                    {"***", "*  ", "***", "  *", "***"},//5
                    {"***", "*  ", "***", "* *", "***"},//6
                    {"***", "  *", "  *", "  *", "  *"},//7
                    {"***", "* *", "***", "* *", "***"},//8
                    {"***", "* *", "***", "  *", "***"},//9
            };
    // Symbol for '.'
    private static final String[] POINT = {"   ", "   ", "   ", "   ", " * ",};

    //Symbol for '-'
    private static final String[] MINUS = {"   ", "   ", "***", "   ", "   ",};

    // method that adds current digit
    private static StringBuilder[] addDigit(StringBuilder[] str, String[] digit) {
        for (int i = 0; i<5; i++){
            str[i].append(digit[i]).append(" ");
        }
        return str;
    }

    //constructing string that contains result
    static void printNumber(double num) {
        StringBuilder number = new StringBuilder();
        number.append(num);
        String current;
        StringBuilder[] result = new StringBuilder[]{
                new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
        };
        if (number.substring(0, 1).equals("-")){
            addDigit(result, MINUS);
            number.delete(0,1);
        }
        for (int i = 0; i < number.length(); i++) {
            current = number.substring(i, i + 1);
            if (current.equals(".")) {
                addDigit(result, POINT);
            } else {
                addDigit(result, DIGITS[Integer.parseInt(current)]);
            }
        }
        // printing whole result
        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }

    }
}
