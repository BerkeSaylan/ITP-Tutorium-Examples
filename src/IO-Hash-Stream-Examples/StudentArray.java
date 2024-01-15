package de.tum.cit.ase;

import java.util.Arrays;
import java.util.Objects;

public class StudentArray {
    private static final int SIZE = 100;
    private Student[] studentArray;

    public StudentArray() {
        this.studentArray = new Student[SIZE];
    }

    public void addStudent(Student student) {
        int index = getIndex(student);
        if (studentArray[index] == null) {
            studentArray[index] = student;
        } else {
            System.out.println("Collision occurred. Unable to add student: " + student.getName());
            while(studentArray[index] != null) {
                index = (index + 1) % SIZE;
            }
        }
    }

    public void removeStudent(Student student) {
        int index = getIndex(student);
        if (studentArray[index] != null && studentArray[index].equals(student)) {
            studentArray[index] = null;
        }
    }

    public Student findStudent(String name) {
        int hash = hash(name);
        int index = hash % SIZE;
        return studentArray[index];
    }

    private int getIndex(Student student) {
        int hash = student.hashCode();
        return hash % SIZE;
    }

    private int hash(String str) {
        int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(str);
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        StudentArray studentArray = new StudentArray();

        Student student1 = new Student("John", 1, 85.5);
        Student student2 = new Student("Alice", 2, 92.0);

        studentArray.addStudent(student1);
        studentArray.addStudent(student2);

        System.out.println("Found Student: " + studentArray.findStudent("Alice"));

        studentArray.removeStudent(student1);

        System.out.println("Remaining Students: " + Arrays.toString(studentArray.studentArray));
    }
}
