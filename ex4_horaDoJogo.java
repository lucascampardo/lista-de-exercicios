import java.util.Scanner;

public class ex4_horaDoJogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.printf("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.printf("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - (horaInicial + horaFinal);
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
