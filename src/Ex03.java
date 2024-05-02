import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Valor B: ");
        int b = sc.nextInt();
        sc.nextLine();

        if (a == b) {
            int c = a + b;
            System.out.println("Soma: " + c);
        }
        else {
            int c = a * b;
            System.out.println("Multiplicação: " + c);
        }
    }
}
