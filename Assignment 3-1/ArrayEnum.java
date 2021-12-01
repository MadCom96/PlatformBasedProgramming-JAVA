import java.util.Scanner;

public class ArrayEnum {
    enum Command{
        QUIT, ADD, LIST, SUM, MAX, MIN, INVCOM
    }
    public static void main(String[] args){
        int[] values = new int[100];
        int index = 0;

        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values, index));
                    break;
                case INVCOM:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
    static Command getCommand(Scanner sc){
        String inputToUpper = sc.next().toUpperCase();
        Command ret = Command.INVCOM;
        if(inputToUpper.equals("ADD"))
            ret = Command.ADD;
        else if(inputToUpper.equals("LIST"))
            ret = Command.LIST;
        else if(inputToUpper.equals("SUM"))
            ret = Command.SUM;
        else if(inputToUpper.equals("QUIT"))
            ret = Command.QUIT;
        else if(inputToUpper.equals("MAX"))
            ret = Command.MAX;
        else if(inputToUpper.equals("MIN"))
            ret = Command.MIN;
        return ret;
    }
    static int getValue(Scanner sc){ return sc.nextInt(); }
    static void printList(int[] values, int index){
        for(int i = 0; i < index; i++){
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }
    static int getSum(int[]values, int index){
        int sum = 0;
        for(int i = 0; i < index; i++){
            sum += values[i];
        }
        return sum;
    }
    static int getMax(int[]values, int index){
        int max = values[0];
        for(int i = 1; i < index; i++){
            if (max < values[i])
                max = values[i];
        }
        return max;
    }
    static int getMin(int[]values, int index){
        int min = values[0];
        for(int i = 1; i < index; i++){
            if (min > values[i])
                min = values[i];
        }
        return min;
    }
}