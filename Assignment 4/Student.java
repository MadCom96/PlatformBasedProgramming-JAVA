import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public Student( String name, int year ){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return String.format("[%s, %d학년]", name, year);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return year == student.year && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
