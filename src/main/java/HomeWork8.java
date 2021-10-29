import org.apache.commons.lang3.StringUtils;

public class HomeWork8 {
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int getMin(int a, int b) {
        return a - b;
    }
    public static int getMult(int a, int b) {
        return a * b;
    }
    public static int getDiv(int a, int b) {
        return a / b;
    }

    public static String abbrMethod(String str) {
        return StringUtils.abbreviate(str, 6);
    }
}
