public class problem_25 {
    public void fibonacci(){
        int fib1 = 0, fib2 = 1, aux ,count  = 1;//Variaveis para funcionamento da sequencia de Fibonacci
        while(Integer.toString(fib2).length() <4){//Transformo o inteiro em String para poder saber seu tamanho e parar o while
            aux = fib2;
            fib2 = fib2 +fib1 ;
            fib1 = aux;
            count++;
        }
        System.out.println("Primeiro número com 4 digitos é : "+fib2+" Seu indicie é : "+count);
        
    }
}
