import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
            this.stream = stream;
    }

    public Stream getStream() {
            return stream;
    }
    public static void sortStreamOfStudentGroup(List<Stream> streamList) {
            Collections.sort(streamList,new StreamComparator());
    }
}
