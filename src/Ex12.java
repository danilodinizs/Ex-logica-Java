import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double a = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento a seguir: ");

        int x;
        System.out.println("1 - À vista");
        System.out.println("2 - Parcelado");
        sc.nextLine();
        x = sc.nextInt();

        if (x == 1) {
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Pix");
            System.out.println("3 - Crédito");
            sc.nextLine();
            int y = sc.nextInt();
            if (y == 3) {
                a = a - a * 0.10;
                System.out.printf("Valor final do produto: R$%.2f", a);
            }
            else {
                a = a - a * 0.15;
                System.out.printf("Valor final do produto: R$%.2f", a);
            }
        }
        else {
            System.out.println("1 - Duas vezes sem juros");
            System.out.println("2 - Três ou mais vezes");
            sc.nextLine();
            int y = sc.nextInt();
            if(y == 1) {
                System.out.printf("Valor final do produto: R$%.2f", a);
            }
            else {
                a = a * 0.10 + a;
                System.out.printf("Valor final do produto: R$%.2f", a);
            }
        }

        sc.close();
    }
}
