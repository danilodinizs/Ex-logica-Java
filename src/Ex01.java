import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextInt();

        if (a + b < c) {
            System.out.println("Menor");
        }
        else {
            System.out.println("Maior");
        }
    }
}
