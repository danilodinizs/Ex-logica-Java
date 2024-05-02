import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite sua segunda nota: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite sua terceira nota: ");
        double c = sc.nextDouble();
        sc.nextLine();

        double media = (a + b + c) / 3;
        if (media < 7) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
    }
}
