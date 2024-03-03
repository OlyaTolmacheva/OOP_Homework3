public class Student implements Comparable<Student> {
    public Integer studentId;
    public String firstName;
    public String secondName;
    public String lastName;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) { //сравнивает переданный объект(о) с текущим
        if (studentId > o.studentId)
            return 1;
        if (studentId < o.studentId)
            return -1;
        return 0;
    // или return studentId.compareTo(o.studentId);
    // для одного класса метод можно использовать только один раз
    }
}
