package policia_federal;

import java.util.Scanner;

public class Exec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        problem_19 p19 = new problem_19();
        problem_5 p5 = new problem_5();
        problem_25 p25 = new problem_25();
        int selec = 0;
        boolean continuar = true;
        do {
            System.out.printf("\nEscolha um dos Problemas a ser revolvido\n"
                            + "1 - Problema 5 : Número positivo divisível por todos os números de 1 a 20\n"
                            + "2 - Problema 19 : Domingos no dia 1 do mês\n"
                            + "3 - Problema 25 : Primeiro número com 4 digitos na sequencia de Fibonacci\n"
                            + "4 - Sair\n");
            selec = input.nextInt();
            switch (selec) {
                case 1:
                    p5.menorNumero();
                    break;
                case 2:
                    p19.Sunday();
                    break;
                case 3:
                    p25.fibonacci();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (continuar);
    }
}
