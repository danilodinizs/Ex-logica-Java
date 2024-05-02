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
        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (imc < 24.9) {
            System.out.println("Peso ideal (meus parabéns)!");
        }
        else if (imc < 29.9) {
            System.out.println("Levemente acima do peso!");
        }
        else if (imc < 34.9) {
            System.out.println("Obesidade grau 1!");
        }
        else if (imc < 39.9) {
            System.out.println("Obesidade grau 2 (severa)!");
        }
        else {
            System.out.println("Obesidade grau 3 (mórbida)!");
        }
    }
}
