package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MathSymbolsListeners {

    private static StringBuilder sb = new StringBuilder();
    private static String mathSymbol = "";
    private static String stLeft;
    private static String stRight;
    private static int left;
    private static int right;

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public static class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!mathSymbol.equals(PLUS)) {
                calculate();
            }
            setMathSymbol(PLUS);
            if (stRight == null) {
                calculate();
            }
            printSymbol(PLUS);
        }
    }

    public static class MinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!mathSymbol.equals(MINUS)) {
                calculate();
            }
            setMathSymbol(MINUS);
            if (stRight == null) {
                calculate();
            }
            printSymbol(MINUS);
        }
    }

    public static class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!mathSymbol.equals(MULTIPLY)) {
                calculate();
            }
            setMathSymbol(MULTIPLY);
            if (stRight == null) {
                calculate();
            }
            printSymbol(MULTIPLY);
        }
    }

    public static class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!mathSymbol.equals(DIVIDE)) {
                calculate();
            }
            setMathSymbol(DIVIDE);
            if (stRight == null) {
                calculate();
            }
            printSymbol(DIVIDE);
        }
    }

//    TODO Handle clicking = as first symbol, and then other
//    Steps:
//    1. type 10
//    2. click =
//    3. type 5
//    4. click +
//    There is error NullPointerException
    public static class EqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            if (!sb.toString().equals("")) {
//                stRight = sb.toString();
//                right = Integer.parseInt(stRight);
//            }
            calculate();
        }
    }

    public static void appendStringBuilder(long number) {
        sb.append(number);
    }

    private static void setMathSymbol(String symbol) {
        mathSymbol = symbol;
    }

//    TODO Handle dividing by zero
//    It should:
//    + erase previous calculations
//    + print error message
//    + not to print previous number after = or keep calculating with other numbers and symbols
//    - all need to be reset - maybe by the use on C button
//    - after printing message and clearing previous data, message should dissappear, if new data is provided
    private static void calculate() {
        setCalculationSides();
        if (stRight != null) {
            if (mathSymbol.equals(DIVIDE) && right == 0) {
                FrameCreator.setJTextAreaText("");
                System.out.print("Incorrect operation. You can't divide by zero.");
                FrameCreator.appendJTextArea("Incorrect operation. You can't divide by zero.");
                stLeft = null;
                left = 0;
            } else {
                left = getOperation(mathSymbol, left, right);
                stLeft = left + "";
                System.out.print("=" + left);
                FrameCreator.appendJTextArea("=" + left);
            }
            stRight = null;
            right = 0;
        }
    }

    private static void setCalculationSides() {
        if (!sb.toString().equals("")) {
            if (stLeft != null) {
                stRight = sb.toString();
                right = Integer.parseInt(stRight);
            } else {
                stLeft = sb.toString();
                left = Integer.parseInt(stLeft);
            }
            sb = new StringBuilder();
        }
    }

    private static int getOperation(String key, int first, int second) {
        Map<String, Integer> map = new HashMap<>();
        map.put(PLUS, (first + second));
        map.put(MINUS, (first - second));
        map.put(MULTIPLY, (first * second));
        map.put(DIVIDE, (first / second));
        return map.get(key);
    }

    private static void printSymbol(String symbol) {
        if (left != 0 && !isSymbolPrinted(symbol)) {
            System.out.print(symbol);
            FrameCreator.appendJTextArea(symbol);
        }
    }

    private static boolean isSymbolPrinted(String symbol) {
        String text = FrameCreator.getJTextAreaText();
        return text.endsWith(symbol);
    }

}
