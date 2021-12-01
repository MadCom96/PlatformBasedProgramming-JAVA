import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a begin number: ");
        int begin = sc.nextInt();
        System.out.print("Enter an end number: ");
        int end = sc.nextInt();

        //기본
        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }

    private static long getSumBetween(int begin, int end){
        int answer = 0;
        for(int i = begin; i <= end; i++)
            answer += i;
        return answer;
    }

    private static long getProductBetween(int begin, int end){
        int answer = 1;
        for(int i = begin; i <= end; i++)
            answer *= i;
        return answer;
    }
}
