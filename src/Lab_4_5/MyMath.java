package Lab_4_5;

public class MyMath {
    static int count;

    public static double Add(double a, double b) {
        count++;
        return a + b;
    }
    public static double Sub(double a, double b) {
        count++;
        return a - b;
    }
    public static double Mult(double a, double b) {
        count++;
        return a * b;
    }
    public static double Div(double a, double b) {
        count++;
        return a / b;
    }
    public static int num_count() {
        return count;
    }
}
