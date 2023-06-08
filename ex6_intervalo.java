import java.util.Scanner;

public class ex6_intervalo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.printf("Digite o valor desejado: ");
        valor = sc.nextInt();

        if (valor >= 0  && valor < 25) {
            System.out.println("Primeiro Intervalo: 0-25");
        }
        else {
            if (valor >= 25 && valor < 50) {
                System.out.println("Segundo Intervalo: 25-50");
            }
            else {
                if (valor >= 50 && valor < 75) {
                    System.out.println("Terceiro Intervalo: 50-75");
                }
                else {
                    if (valor >=75 && valor < 100) {
                        System.out.println("Quarto Intervalo: 75-100");
                    }
                }
            }
        }

    }
}
