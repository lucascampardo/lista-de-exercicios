import java.util.Scanner;

public class ex5_precoDoLanche {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idLanche;
        double qtdLanche, valorTotal;

        System.out.printf("Digite o código do lanche: ");
        idLanche = sc.nextInt();
        System.out.printf("Digite a quantidade: ");
        qtdLanche = sc.nextDouble();

        if (idLanche == 1) {
            double hotdog = 4.00;
            valorTotal = qtdLanche * hotdog;
            System.out.println("Total a pagar: R$" + valorTotal);
        }
        else {
            if (idLanche == 2) {
                double x_salada = 4.50;
                valorTotal = qtdLanche * 4.50;
                System.out.println("Total a pagar: R$" + valorTotal);
            }
            else {
                if (idLanche == 3) {
                    double x_bacon = 5.00;
                    valorTotal = qtdLanche * 5.00;
                    System.out.println("Total a pagar: R$" + valorTotal);
                }
                else {
                    if (idLanche == 4) {
                        double torrada_simples = 2.00;
                        valorTotal = qtdLanche  * 2.00;
                        System.out.println("Total a pagar: R$" + valorTotal);
                    }
                    else {
                        if (idLanche == 5) {
                            double refrigerante = 1.50;
                            valorTotal = qtdLanche * 1.50;
                            System.out.println("Total a pagar: R$" + valorTotal);
                        }
                    }
                }
            }
        }

    }
}
