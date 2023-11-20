import java.io.File;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException, NullPointerException {

        // try {
        // File f = new File("abc.txt");
        // f.createNewFile();// IOException { less,security }
        // } catch (IOException e) {
        // System.out.println("SMW");
        // }

        File f = new File("a.txt");
        f.createNewFile();
        f.getCanonicalFile(); // NullPointerException

    }
}
