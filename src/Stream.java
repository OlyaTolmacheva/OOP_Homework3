import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Stream implements Iterable<StudentGroup>,Comparable<Stream>, Comparator<Stream> {
    List<StudentGroup> studentGroupList;
    public Stream() {
        this.studentGroupList = new ArrayList<>();
    }

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }


    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public String toString() {
        return "Steam{" +
                "studentGroupList=" + studentGroupList +
                '}';
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator((List<StudentGroup>) this);
    }

    @Override
    public int compareTo(Stream o) {
        System.out.println("studentGroupList.size() o.studentGroupList.size() "+this.studentGroupList.size()+" "+o.studentGroupList.size());
        if (this.studentGroupList.size()>o.studentGroupList.size()){

            return 1;
        }
        else if (this.studentGroupList.size()<o.studentGroupList.size()){

            return -1;
        }
        else return 0;
    }

    public int getSize(){
        return this.studentGroupList.size();
    }
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.getSize(), o2.getSize());
    }
}
