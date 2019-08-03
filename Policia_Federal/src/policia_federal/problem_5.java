package policia_federal;

public class problem_5 {

    public void menorNumero() {
        boolean continua = true;//Variavel para continuar o do while
        int num = 2, menor = 0;
        do {
            for (int div = 20; div >= 0; div--) {//For para fazer a divisão dos números
                if (div == 0) {//caso a div chegue a 0 significa que o número é divisivel pelos valores
                    menor = num;
                    continua = false;
                } else if (num % div != 0) {//Caso o número não seja divisivel ele incrementa duas vezes, assim o número sempre será positivo
                    num++;
                    num++;
                    break;
                }
            }
        } while (continua);
        System.out.println("O menor número positivo divisilvel por todos os números entre 1 - 20 é: " + menor);
    }
}
