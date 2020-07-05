package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MathSymbolsListeners extends Listeners {

    private static StringBuilder sb = new StringBuilder();
    private static String mathSymbol;
    private static String stLeft;
    private static String stRight;
    private static int left;
    private static int right;

    public static class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setCalculationSides();
            if (mathSymbol != null) {
                calculate();
            } else {
                mathSymbol = "plus";
                calculate();
            }
            mathSymbol = "plus";
            sb = new StringBuilder();
            if (sb.toString().equals("")) {
                System.out.print("+");
                FrameCreator.appendJTextArea("+");
            }
        }
    }

    public static class MinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setCalculationSides();
            if (mathSymbol != null) {
                calculate();
            } else {
                mathSymbol = "minus";
                calculate();
            }
            mathSymbol = "minus";
            sb = new StringBuilder();
            if (sb.toString().equals("")) {
                System.out.print("-");
                FrameCreator.appendJTextArea("-");
            }
        }
    }

    public static class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setCalculationSides();
            if (mathSymbol != null) {
                calculate();
            } else {
                mathSymbol = "multiply";
                calculate();
            }
            mathSymbol = "multiply";
            sb = new StringBuilder();
            if (sb.toString().equals("")) {
                System.out.print("*");
                FrameCreator.appendJTextArea("*");
            }
        }
    }

    public static class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setCalculationSides();
            if (mathSymbol != null) {
                calculate();
            } else {
                mathSymbol = "divide";
                calculate();
            }
            mathSymbol = "divide";
            sb = new StringBuilder();
            if (sb.toString().equals("")) {
                System.out.print("/");
                FrameCreator.appendJTextArea("/");
            }
        }
    }

    public static class EqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setCalculationSides();
//            if (!sb.toString().equals("")) {
//                stRight = sb.toString();
//                right = Integer.parseInt(stRight);
//            }
            calculate();
            sb = new StringBuilder();
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
        }
    }

    private static void calculate() {
        if (stRight != null) {
//            if (mathSymbol.equals("divide")) {
//                left = 0;
//            } else {
            left = getOperation(mathSymbol, left, right);
//            }
            stLeft = left + "";
            stRight = null;
            right = 0;
            System.out.print("=" + left);
            FrameCreator.appendJTextArea("=" + left);
        }
    }

    private static int getOperation(String key, int first, int second) {
        Map<String, Integer> map = new HashMap<>();
        map.put("plus", (first + second));
        map.put("minus", (first - second));
        map.put("multiply", (first * second));
        map.put("divide", (first / second));
        return map.get(key);
    }

    public static void appendStringBuilder(long number) {
        sb.append(number);
    }

}
