import java.util.Scanner;

public class ex2_parOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.printf("Digite um número:");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Esse número é par!");
        }
        else {
            System.out.println("Esse número é ímpar!");
        }

        sc.close();
    }
}
