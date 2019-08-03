package policia_federal;

public class problem_25 {
    public void fibonacci(){
        int fib1 = 0, fib2 = 1, aux;
        while(Integer.toString(fib2).length() <4){
            aux = fib2;
            fib2 = fib2 +fib1 ;
            fib1 = aux;
        }
        System.out.println("Primeiro número com 4 digitos é :"+fib2);
        
    }
}
