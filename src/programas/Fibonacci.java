package programas;
import java.util.Scanner;


public class Fibonacci {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um n�mero: ");
	        int num = sc.nextInt();

	        int fib1 = 0, fib2 = 1, fib3 = 1;
	        while (fib3 < num) {
	            fib1 = fib2;
	            fib2 = fib3;
	            fib3 = fib1 + fib2;
	        }

	        if (fib3 == num) {
	            System.out.println(num + " pertence � sequ�ncia de Fibonacci.");
	        } else {
	            System.out.println(num + " n�o pertence � sequ�ncia de Fibonacci.");
	        }
	    }
	}

