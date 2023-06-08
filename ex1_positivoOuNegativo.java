import java.util.Scanner;

public class ex1_positivoOuNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;

        System.out.printf("Digite um número:");
        N = sc.nextInt();

        if (N >= 1) {
            System.out.println("POSITIVO!");
        }
        else {
            if (N == 0) {
                System.out.println("ZERO!");
            }
            else {
                System.out.println("NEGATIVO!");
            }
        }

    }
}