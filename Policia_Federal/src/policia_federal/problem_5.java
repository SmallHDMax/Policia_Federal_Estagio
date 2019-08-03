package policia_federal;

public class problem_5 {

    public void menorNumero() {
        boolean continua = true;
        int num = 2, menor = 0;
        do {
            for (int div = 20; div >= 0; div--) {
                if (div == 0) {
                    menor = num;
                    continua = false;
                } else if (num % div != 0) {
                    num++;
                    num++;
                    break;
                }
            }
        } while (continua);
        System.out.println("O menor número positivo divisilvel por todos os números entre 1 - 20 é: " + menor);
    }
}
