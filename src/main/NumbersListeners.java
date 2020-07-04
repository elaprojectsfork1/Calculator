package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersListeners {

    public static class OneListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(1);
            System.out.print(1);
            FrameCreator.appendJTextArea("1");
        }
    }

    public static class TwoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(2);
            System.out.print(2);
            FrameCreator.appendJTextArea("2");
        }
    }

    public static class ThreeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(3);
            System.out.print(3);
            FrameCreator.appendJTextArea("3");
        }
    }

    public static class FourListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(4);
            System.out.print(4);
            FrameCreator.appendJTextArea("4");
        }
    }

    public static class FiveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(5);
            System.out.print(5);
            FrameCreator.appendJTextArea("5");
        }
    }

    public static class SixListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(6);
            System.out.print(6);
            FrameCreator.appendJTextArea("6");
        }
    }

    public static class SevenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(7);
            System.out.print(7);
            FrameCreator.appendJTextArea("7");
        }
    }

    public static class EightListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(8);
            System.out.print(8);
            FrameCreator.appendJTextArea("8");
        }
    }

    public static class NineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(9);
            System.out.print(9);
            FrameCreator.appendJTextArea("9");
        }
    }

    public static class ZeroListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MathSymbolsListeners.appendStringBuilder(0);
            System.out.print(0);
            FrameCreator.appendJTextArea("0");
        }
    }

}