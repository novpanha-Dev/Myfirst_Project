package Application;

public class device {
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
    public int divide(int a, int b,int c) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b /c ;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Cannot divide by zero.");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        device objDev = new device();
        System.out.printf("result"+objDev.divide(56,89));
        System.out.printf("result(double)"+objDev.divide(47456,89));
        System.out.printf("result(3 int)"+objDev.divide(232,89,4));

    }
}
