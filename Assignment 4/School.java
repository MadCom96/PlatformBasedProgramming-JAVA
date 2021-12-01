import java.util.Arrays;
import java.util.Objects;

public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public School( String name, int limit ){
        this.name = name;
        this.limit = limit;
        students = new Student[limit];
        studentCount = 0;
    }
    public void addStudent( Student s ){
        students[studentCount++] = s;
    }
    public void removeAllStudent(){
        students = new Student[limit];
        studentCount = 0;
    }
    public Student findStudent( String name, int year ){
        Student ret = null;
        for(int i = 0; i < studentCount; i++)
            if(students[i].getName().equals(name) && students[i].getYear() == year)
                ret = students[i];
        return ret;
    }
    @Override
    public String toString(){
        String msg = "School Name: " + name + " Student Count: " + studentCount + "\n";
        for ( int i = 0; i < studentCount; i++ ) {
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof School)) return false;
        School e = (School) o;
        if(name.equals(e.name) && limit == e.limit)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, limit, studentCount);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    //constructor, equals(), hashCode()
}
