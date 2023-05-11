import java.util.Scanner;

public class Addition {
    public static void getAddition(int no, int b){
        int z = no+b;
        System.out.println("addition "+z);

    }
    public static void main(String[] args) {
        System.out.println("Enter 1st numbers to perform addtion");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Entered Values "+ x);

        System.out.println("Enter 2nd numbers to perform addtion");

        int y = scanner.nextInt();
        System.out.println("Entered Values "+ y);
        getAddition(x,y);


    }
}
