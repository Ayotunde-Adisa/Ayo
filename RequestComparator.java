package library;

    import java.util.Comparator;

    public class RequestComparator implements Comparator<BookRequest> {
        @Override
        public int compare(BookRequest br1, BookRequest br2) {
            Person p1 = br1.getRequester();
            Person p2 = br2.getRequester();

            if (p1 instanceof Teacher && !(p2 instanceof Teacher)) {
                return -1;
            } else if (p2 instanceof Teacher && !(p1 instanceof Teacher)) {
                return 1;
            } else if (p1 instanceof Student && p2 instanceof Student) {
                Student s1 = (Student) p1;
                Student s2 = (Student) p2;
                if (s1.isSenior() && !s2.isSenior()) {
                    return -1;
                } else if (s2.isSenior() && !s1.isSenior()) {
                    return 1;
                }
            }
            return 0;
        }
    }