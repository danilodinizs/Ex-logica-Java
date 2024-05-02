import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Primeiro número");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Segundo número");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Terceiro número");
        c = sc.nextInt();

        if (a + b < c) {
            System.out.println("Menor");
        }
        else {
            System.out.println("Maior");
        }
    }
}
