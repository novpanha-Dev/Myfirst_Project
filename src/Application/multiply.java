package Application;

public class multiply {

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        multiply adder = new  multiply();
        System.out.println("Multiply(int): " + adder.multiply(200,300));
        System.out.println("Multiply(double): " + adder.multiply(4.5, 2.0));
        System.out.println("Multiply(3 int): " + adder.multiply(2, 3, 4));
    }
}
