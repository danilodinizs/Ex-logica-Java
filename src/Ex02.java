import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print("Número par e");
        }
        else {
            System.out.print("Número ímpar e");
        }

        if (a < 0) {
            System.out.println(" negativo.");
        }
        else {
            System.out.println(" positivo.");
        }
    }
}
