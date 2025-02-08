import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        System.out.println("Test main");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = tinhtong(a,b);
        System.out.println("sum = " + sum);
    }
    private static int tinhtong(int a, int b){
        return a+b;
    }
}
