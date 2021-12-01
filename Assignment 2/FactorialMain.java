import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i<=10 ; i++){
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }

        sc.close();
    }
    private static long getFactorial(final int n){
        int answer = 1;
        for(int i = 1; i <= n; i++){
            answer *= i;
        }
        return answer;
    }
}
