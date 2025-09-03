package Application;

public class classmain {
    public static void main(String[] args) {
        int i= 0;
        switch (i){
            case 1:System.out.print("One");
            case 2:System.out.print("Two");
            case 3:System.out.print("Default");
        }
        i=2;
        switch(i){
            case 1:System.out.print("A");break;
            case 2:System.out.print("B");
            case 3:System.out.print("C");break;
            default:System.out.print("D");
        }

    }

}


