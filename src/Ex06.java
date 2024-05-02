import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double a = sc.nextInt();

        double reajuste = (a * 0.05) + a;
        System.out.println("O novo número com reajuste de 5%: " + reajuste);
    }
}
