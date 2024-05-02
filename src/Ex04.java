import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Sucessor: " + (a + 1));
        System.out.println("Antecessor: " + (a - 1));
    }
}
