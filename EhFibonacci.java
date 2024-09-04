import java.util.Scanner;

public class EhFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int num = sc.nextInt();

        if (fibonacciCheck(num)) {
            System.out.println("O número " + num + " pertence a sequência de Fibonacci!");
        } else {
            System.out.println("O número " + num + " não pertence a sequência de Fibonacci!");
        }

        sc.close();
    }

    public static boolean fibonacciCheck(int n){
        if (n < 0) {
            return false;            
        }

        int a = 0;
        int b = 1;

        if (n == 0 || n == 1) {
            return true;
            }

        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }

            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
    
}
