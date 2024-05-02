import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double s = sc.nextDouble();
        System.out.printf("Você recebe %.2f salários mínimos (sálario mínimo base - R$1.293,20)", (s / 1293.20));
    }
}
