import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular seu IMC (Índice de Massa Corporal)!");

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.1f!", imc);
    }
}
