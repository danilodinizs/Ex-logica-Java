import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor de A");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor de B");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        sc.close();
    }
}
