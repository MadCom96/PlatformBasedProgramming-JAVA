package edu.pnu.admin;
import java.util.Scanner;

enum Command {ADD, FIND, CLEAR, LIST, QUIT, INVALID}
public class SchoolTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        School pnu = new School("PNU", 100);
        while(true){
            final Command cmd = getCommand(scanner);
            if( cmd == Command.QUIT ){
                System.out.println("Bye");
                break;
            }
            if( cmd == Command.INVALID ){
                System.out.println("Invalid Operation!");
                continue;
            }
            switch ( cmd ){
                case ADD:
                    Student newStudent = createStudent();
                    pnu.addStudent(newStudent);
                    break;
                case FIND: findStudent(pnu); break;
                case CLEAR: pnu.removeAllStudent(); break;
                case LIST: System.out.println(pnu); break;
                default: break;
            }
        }
    }
    private static Student createStudent(){
        final String studentName = scanner.next();
        final int schoolYear = scanner.nextInt();
        return new Student(studentName, schoolYear);
    }
    private static void findStudent(final School school){
        final String studentName = scanner.next();
        final int schoolYear = scanner.nextInt();
        final Student foundStudent = school.findStudent(studentName, schoolYear);
        if (foundStudent != null)
            System.out.println(foundStudent);
        else
            System.out.println("Student Not Found with name " + studentName + " and year " + schoolYear);
    }
    private  static Command getCommand(final Scanner scanner){
        System.out.print("Enter Command String! ");
        final String commandStr = scanner.next().toUpperCase();
        Command command = Command.INVALID;
        try {
            command = Command.valueOf(commandStr);
        }catch (IllegalArgumentException e){
        }
        return command;
    }
}
