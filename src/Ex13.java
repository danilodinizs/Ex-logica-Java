import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) System.out.println("Menor de idade");
        else System.out.println("Maior de idade");

        sc.close();
    }
}
