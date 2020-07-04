package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class FrameCreator {

    private static JFrame jFrame;
    private static BorderLayout uklad;
    private static JTextArea jTextArea;
    private static JButton buttonOne;
    private static JButton buttonTwo;
    private static JButton buttonThree;
    private static JButton buttonFour;
    private static JButton buttonFive;
    private static JButton buttonSix;
    private static JButton buttonSeven;
    private static JButton buttonEight;
    private static JButton buttonNine;
    private static JButton buttonZero;
    private static JButton buttonPlus;
    private static JButton buttonMinus;
    private static JButton buttonMultiply;
    private static JButton buttonDivide;
    private static JButton buttonEquals;
    private static JButton buttonClear;
    private static JPanel jPanelGlowny;
    private static JPanel jPanelA;
    private static JPanel jPanelB;
    private static JPanel jPanelC;
    GridLayout obszarPrzyciskow;

    public void createFrame() {
        jFrame = new JFrame("Kalkulator");
        uklad = new BorderLayout();
        jPanelGlowny = new JPanel(uklad);
        jPanelGlowny.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        jPanelA = new JPanel();
        jTextArea = new JTextArea(10, 1);
        jTextArea.setPreferredSize(new Dimension(250, 150));
//        jTextArea.setEditable(false);
        jPanelA.add(jTextArea);

        buttonOne = new JButton("1");
        buttonOne.setPreferredSize(new Dimension(50, 40));
        buttonOne.addActionListener(new NumbersListeners.OneListener());

        buttonTwo = new JButton("2");
        buttonTwo.setPreferredSize(new Dimension(50, 40));
        buttonTwo.addActionListener(new NumbersListeners.TwoListener());

        buttonThree = new JButton("3");
        buttonThree.setPreferredSize(new Dimension(50, 40));
        buttonThree.addActionListener(new NumbersListeners.ThreeListener());

        buttonFour = new JButton("4");
        buttonFour.setPreferredSize(new Dimension(50, 40));
        buttonFour.addActionListener(new NumbersListeners.FourListener());

        buttonFive = new JButton("5");
        buttonFive.setPreferredSize(new Dimension(50, 40));
        buttonFive.addActionListener(new NumbersListeners.FiveListener());

        buttonSix = new JButton("6");
        buttonSix.setPreferredSize(new Dimension(50, 40));
        buttonSix.addActionListener(new NumbersListeners.SixListener());

        buttonSeven = new JButton("7");
        buttonSeven.setPreferredSize(new Dimension(50, 40));
        buttonSeven.addActionListener(new NumbersListeners.SevenListener());

        buttonEight = new JButton("8");
        buttonEight.setPreferredSize(new Dimension(50, 40));
        buttonSeven.addActionListener(new NumbersListeners.EightListener());

        buttonNine = new JButton("9");
        buttonNine.setPreferredSize(new Dimension(50, 40));
        buttonNine.addActionListener(new NumbersListeners.NineListener());

        buttonZero = new JButton("0");
        buttonZero.setPreferredSize(new Dimension(50, 40));
        buttonZero.addActionListener(new NumbersListeners.ZeroListener());

        buttonPlus = new JButton("+");
        buttonPlus.setPreferredSize(new Dimension(50, 40));
        buttonPlus.addActionListener(new MathSymbolsListeners.PlusListener());

        buttonMinus = new JButton("-");
        buttonMinus.setPreferredSize(new Dimension(50, 40));
        buttonMinus.addActionListener(new MathSymbolsListeners.MinusListener());

        buttonMultiply = new JButton("*");
        buttonMultiply.setPreferredSize(new Dimension(50, 40));
        buttonMultiply.addActionListener(new MathSymbolsListeners.MultiplyListener());

        buttonDivide = new JButton("/");
        buttonDivide.setPreferredSize(new Dimension(50, 40));
        buttonDivide.addActionListener(new MathSymbolsListeners.DivideListener());

        buttonEquals = new JButton("=");
        buttonEquals.setPreferredSize(new Dimension(50, 40));
        buttonEquals.addActionListener(new MathSymbolsListeners.EqualsListener());

        buttonClear = new JButton("C");
//        buttonClear.setPreferredSize(new Dimension(200, 40));
//        buttonClear.setMargin(new Insets(100,100,100,100));
        buttonClear.setBounds(70, 75, 150, 50);
        buttonClear.addActionListener(new ClearListener());

        obszarPrzyciskow = new GridLayout(5, 3, 5, 5);
        jPanelB = new JPanel(obszarPrzyciskow);
        jPanelB.add(buttonOne);
        jPanelB.add(buttonTwo);
        jPanelB.add(buttonThree);
        jPanelB.add(buttonFour);
        jPanelB.add(buttonFive);
        jPanelB.add(buttonSix);
        jPanelB.add(buttonSeven);
        jPanelB.add(buttonEight);
        jPanelB.add(buttonNine);
        jPanelB.add(buttonPlus);
        jPanelB.add(buttonZero);
        jPanelB.add(buttonMultiply);
        jPanelB.add(buttonMinus);
        jPanelB.add(buttonEquals);
        jPanelB.add(buttonDivide);

        JPanel zbiorczy = new JPanel(new GridLayout(2, 1, 5, 5));
        zbiorczy.setPreferredSize(new Dimension(300, 300));
        jPanelC = new JPanel(new GridLayout(1, 1, 5, 5));
        jPanelC.setLayout(null);
        jPanelC.setPreferredSize(new Dimension(300, 50));
        jPanelC.add(buttonClear);
        zbiorczy.add(jPanelC);
        zbiorczy.add(jPanelB);

        jFrame.getContentPane().add(BorderLayout.SOUTH, zbiorczy);
//        jFrame.getContentPane().add(BorderLayout.CENTER, jPanelC);
//        jFrame.getContentPane().add(BorderLayout.SOUTH, jPanelB);
        jFrame.getContentPane().add(BorderLayout.NORTH, jPanelA);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 500);
        jFrame.setVisible(true);
    }

//    private static StringBuilder sb = new StringBuilder();
//    private static String mathSymbol;
//    private static String stLeft;
//    private static String stRight;
//    private static int left;
//    private static int right;

//    private static class PlusListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            setCalculationSides();
//            if (mathSymbol != null) {
//                calculate();
//            } else {
//                mathSymbol = "plus";
//                calculate();
//            }
//            mathSymbol = "plus";
//            sb = new StringBuilder();
//            if (sb.toString().equals("")) {
//                System.out.print("+");
//                jTextArea.append("+");
//            }
//        }
//    }
//
//    private static class MinusListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            setCalculationSides();
//            if (mathSymbol != null) {
//                calculate();
//            } else {
//                mathSymbol = "minus";
//                calculate();
//            }
//            mathSymbol = "minus";
//            sb = new StringBuilder();
//            if (sb.toString().equals("")) {
//                System.out.print("-");
//                jTextArea.append("-");
//            }
//        }
//    }
//
//    private static class MultiplyListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            setCalculationSides();
//            if (mathSymbol != null) {
//                calculate();
//            } else {
//                mathSymbol = "multiply";
//                calculate();
//            }
//            mathSymbol = "multiply";
//            sb = new StringBuilder();
//            if (sb.toString().equals("")) {
//                System.out.print("*");
//                jTextArea.append("*");
//            }
//        }
//    }
//
//    private static class DivideListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            setCalculationSides();
//            if (mathSymbol != null) {
//                calculate();
//            } else {
//                mathSymbol = "divide";
//                calculate();
//            }
//            mathSymbol = "divide";
//            sb = new StringBuilder();
//            if (sb.toString().equals("")) {
//                System.out.print("/");
//                jTextArea.append("/");
//            }
//        }
//    }
//
//    private static class EqualsListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            setCalculationSides();
////            if (!sb.toString().equals("")) {
////                stRight = sb.toString();
////                right = Integer.parseInt(stRight);
////            }
//            calculate();
//            sb = new StringBuilder();
//        }
//    }

    private static class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jTextArea = null;
        }
    }

//    private static void setCalculationSides() {
//        if (!sb.toString().equals("")) {
//            if (stLeft != null) {
//                stRight = sb.toString();
//                right = Integer.parseInt(stRight);
//            } else {
//                stLeft = sb.toString();
//                left = Integer.parseInt(stLeft);
//            }
//        }
//    }
//
//    private static void calculate() {
//        if (stRight != null) {
////            if (mathSymbol.equals("divide")) {
////                left = 0;
////            } else {
//                left = getOperation(mathSymbol, left, right);
////            }
//            stLeft = left + "";
//            stRight = null;
//            right = 0;
//            System.out.print("=" + left);
//            jTextArea.append("=" + left);
//        }
//    }
//
//    private static int getOperation(String key, int first, int second) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("plus", (first + second));
//        map.put("minus", (first - second));
//        map.put("multiply", (first * second));
//        map.put("divide", (first / second));
//        return map.get(key);
//    }

//    public static void appendStringBuilder(long number) {
//        sb.append(number);
//    }

    public static void appendJTextArea(String text) {
        jTextArea.append(text);
    }

}