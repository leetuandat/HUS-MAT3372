package lab09.Library;

import java.util.Objects;
public class Student implements Comparable<Student> {
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastname = lastName;
        this.average = average;
    }

    public Student(String name,
                   String lastName,
                   String phone,
                   double average) {
        this.name = name;
        this.lastname = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return (name.compareTo(anotherStudent.name) == 0)
                ? lastname.compareTo(anotherStudent.lastname)
                : (name.compareTo(anotherStudent.name));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return String.format("Student[name = \'%s\', lastname = \'%s\', phone = \'%s\', average = \'%s\']",
                name, lastname, phone, average);
    }
}
