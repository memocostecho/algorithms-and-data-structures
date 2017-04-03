import java.util.ArrayList;
import java.util.Arrays;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Examples:
 * <p>
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateExpression {

    private static int evalRPN(ArrayList<String> a) {
        Stack<Integer> stack = new Stack<>();

        for (String string : a) {
            if (!isOperand(string)) {
                stack.push(Integer.parseInt(string));
            } else {
                int operand2 = (Integer) stack.pop().getValue();
                int operand1 = (Integer) stack.pop().getValue();


                switch (string) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return (Integer) stack.pop().getValue();

    }


    private static boolean isOperand(String string) {
        return (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/"));
    }


    public static void main(String[] args) {
        System.out.println(evalRPN(new ArrayList<>(Arrays.asList(new String[] {"2", "1", "+", "3", "*"}))));
        System.out.println(evalRPN(new ArrayList<>(Arrays.asList(new String[] {"4", "13", "5", "/", "+"}))));
    }
}
