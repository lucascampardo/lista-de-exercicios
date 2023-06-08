import java.util.Scanner;

public class ex3_multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.printf("Digite um número: ");
        A = sc.nextInt();
        System.out.printf("Digite outro número: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos!");
        }
        else {
            System.out.println("Não são múltiplos!");
        }

        sc.close();

    }

}
