package week2.problems;

import week2.problems.Generics.GenericStack;


/* To solve equations */
public class DiijkstraTwoStackAlgorithm {
    private final GenericStack<Double> valueStack;
    private final GenericStack<String> operatorStack;

    public DiijkstraTwoStackAlgorithm(){
        valueStack=new GenericStack<>();
        operatorStack=new GenericStack<>();
    }

    public double evaluate(String expression){
        char[] c= expression.toCharArray();
        for (char value : c) {
            if (Character.isDigit(value)) {
                valueStack.push(Double.valueOf(String.valueOf(value)));
            } else if (value == '*' || value == '+' || value == '-' || value == '/' || value == '%') {
                operatorStack.push(String.valueOf(value));
            } else if (value == ')') {
                valueStack.push(execute(valueStack.pop(), valueStack.pop(), operatorStack.pop()));
            }
        }
        return valueStack.pop();
    }

    private double execute(double a, double b, String operator){
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        DiijkstraTwoStackAlgorithm d=new DiijkstraTwoStackAlgorithm();
        System.out.println(d.evaluate("(1+((2+3)*(4*5)))"));
    }
}
