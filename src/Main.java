import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(4, "AAA", "AAA", "AAA");
        Student student2 = new Student(2, "Aaa", "Aaa", "Aaa");
        Student student3 = new Student(3, "aaa", "aaa", "aaa");
        Student student4 = new Student(1, "baa", "baa", "baa");

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        for (Student student : studentGroup) {
            //System.out.println(student);
        }

        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }


        List<Student> studentList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        studentGroup2.addStudent(student1);
        studentGroup2.addStudent(student2);

        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup);
        studentGroupList.add(studentGroup2);


        StreamIterator streamIterator = new StreamIterator(studentGroupList);
        while (streamIterator.hasNext()) {
            System.out.println(streamIterator.next().toString());
        }
        Stream stream1 = new Stream();
        stream1.studentGroupList.add(studentGroup);
        Stream stream2 = new Stream();
        stream2.studentGroupList.add(studentGroup2);
        stream2.studentGroupList.add(studentGroup2);

        System.out.println(stream1.compareTo(stream2));//studentGroupList.size() o.studentGroupList.size() 1 2  ===-1

        List<Stream> streamList = new ArrayList<>(Arrays.asList(stream1,stream2));
        StreamService.sortStreamOfStudentGroup(streamList);
        System.out.println(streamList);
    }
}