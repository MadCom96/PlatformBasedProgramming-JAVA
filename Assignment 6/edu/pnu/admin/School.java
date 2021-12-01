package edu.pnu.admin;
import edu.pnu.collection.*;

public  class School{
    private final String name;
    private GenericList<Student> students;
    private int index = 0;
    private int limit;

    public School(final String name, final int limit) {
        this.name = name;
        this.limit = limit;
        students = new GenericList<Student>(limit);
    }

    public void addStudent(Student newStudent){
        if(limit <= index) return;
        students.add(index++, newStudent);
    }

    public void removeAllStudent(){
        index = 0;
        students = new GenericList<Student>(limit);
    }
    public Student findStudent(String name, int year){
        return students.findElement(new Student(name, year));
    }

    public String get() {
        return name;
    }

    @Override
    public String toString() {
        return "School Name: " + get() + " Student Count: " + index + "\n" +students.toString();
    }
}