import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};
public class StringSetManager {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true){
            final StringCommand command = getCommand(scanner);
            if (command == StringCommand.QUIT){
                System.out.println("BYE!"); break;
            }
            switch (command) {
                case ADD:
                    final String str1 = getString(scanner);
                    add(stringSet, str1);
                    break;
                case REMOVE:
                    final String str2 = getString(scanner);
                    remove(stringSet, str2);
                    break;
                case CLEAN:
                    clear(stringSet);
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
    }
    private static StringCommand getCommand(Scanner sc){
        String s = sc.next();
        StringCommand ret = StringCommand.INVALID;
        if (s.equalsIgnoreCase("ADD")) ret = StringCommand.ADD;
        else if (s.equalsIgnoreCase("REMOVE")) ret = StringCommand.REMOVE;
        else if (s.equalsIgnoreCase("CLEAN")) ret = StringCommand.CLEAN;
        else if (s.equalsIgnoreCase("QUIT")) ret = StringCommand.QUIT;
        return ret;
    }
    private static String getString(Scanner sc){
        return sc.next();
    }
    private static void add(String[] stringSet, String str){
        int index = 0;
        while(stringSet[index] != null){
            if (stringSet[index].equals(str))
                return;
            else
                index++;
        }
        stringSet[index] = str;
    }
    private static void remove(String[] stringSet, String str){
        int index = 0;
        boolean found = false;
        while(stringSet[index] != null){
            if(!found){
                if (stringSet[index].equals(str)){
                    found = true;
                    stringSet[index] = stringSet[index + 1];
                }
            }
            else{
                if(stringSet[index + 1] == null){
                    stringSet[index] = null;
                    return;
                }else{
                    stringSet[index] = stringSet[index + 1];
                }
            }
            index++;
        }
    }
    private static void clear(String[] stringSet){
        int index = 0;
        while(stringSet[index] != null){
            stringSet[index++] = null;
        }
    }
    private static void print(String[] stringSet){
        int index = 0;
        while(stringSet[index++] != null){}
        System.out.print("Element Size: " + (index - 1) + ", Values = [");

        index = 0;
        while(stringSet[index] != null){
            System.out.print(stringSet[index++]);
            if(stringSet[index] != null)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
