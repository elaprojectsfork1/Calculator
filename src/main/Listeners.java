package main;

public class Listeners {

    private static StringBuilder sb = new StringBuilder();
    private static String mathSymbol;
    private static String stLeft;
    private static String stRight;
    private static int left;
    private static int right;

    public Listeners() {}

    public static void appendStringBuilder(long number) {
        sb.append(number);
    }

    public static StringBuilder getSb() {
        return sb;
    }

    public static void setSb(StringBuilder sb) {
        Listeners.sb = sb;
    }

    public static String getMathSymbol() {
        return mathSymbol;
    }

    public static void setMathSymbol(String mathSymbol) {
        Listeners.mathSymbol = mathSymbol;
    }

    public static String getStLeft() {
        return stLeft;
    }

    public static void setStLeft(String stLeft) {
        Listeners.stLeft = stLeft;
    }

    public static String getStRight() {
        return stRight;
    }

    public static void setStRight(String stRight) {
        Listeners.stRight = stRight;
    }

    public static int getLeft() {
        return left;
    }

    public static void setLeft(int left) {
        Listeners.left = left;
    }

    public static int getRight() {
        return right;
    }

    public static void setRight(int right) {
        Listeners.right = right;
    }


}
