package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherSymbolsListeners extends Listeners {

    private static StringBuilder sb = new StringBuilder();
    private static String mathSymbol;
    private static String stLeft;
    private static String stRight;
    private static int left;
    private static int right;

//    TODO Implement those buttons

//    TODO Use of C button
//    This function stands for “global clear” that clears or deletes the entire calculation.
//    So in case you hit C instead of CE in the previous calculation, you have to start the entire calculation again.
//    Currently - it clears jTextArea, but do not clear calculation data. Example:
//    - type 10
//    - click C - jTextArea is cleared
//    - click + - it is printed
//    - type 5 - it is printed
//    - click = - add action is done
//    After clicking C you see +5=15.
//    Everything should be cleared and + shouldn't be printed. It should wait for new value of left side of calculation.
    public static class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clearAll();
            setStLeft(null);
//            setLeft(0);
            setStRight(null);
//            setRight(0);
        }
    }

//    TODO Use of CE button
//    this will only erase or delete the previous entry before you have performed any operation on it.
//    Now on this step, you realize that the entry is wrong and you wrote 750 instead of 570;
//    you can use this function of CE only to erase the last number inserted.
//    Once you press CE, you can enter the right data now and proceed with the calculation.
    public static class ClearEntryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //
        }
    }

    public static void clearAll() {
        FrameCreator.setJTextAreaText(null);
    }

}
