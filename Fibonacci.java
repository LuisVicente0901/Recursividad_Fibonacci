
import java.util.Scanner;
public class Fibonacci
{
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.println("Introduce el número de elementos a mostrar en la serie");
    int limite = num.nextInt();
    for(int i=0;i<limite;i++){
        System.out.println(funcionFibonacci(i)+", ");
    }
}

public static int funcionFibonacci(int n){
    if(n<=1){
        return 1;
    }
    else{
        return funcionFibonacci(n-1)+funcionFibonacci(n-2);
    }
}
}
