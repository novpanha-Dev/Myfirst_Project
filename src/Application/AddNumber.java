package Application;

public class AddNumber {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        AddNumber adder =new AddNumber();
        System.out.println("Sum(int):" + adder.add(3,5));
        System.out.println("Sum(double):" + adder.add(4.5,6.0));
        System.out.println("Sum(3int):" + adder.add(4,5,6));
    }


}
