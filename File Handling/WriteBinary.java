import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinary {
    public static void main(String[] args) {
        FileOutputStream fw=null;
        String data="Hello Everyone...!";
        try {
            fw= new FileOutputStream("src/WriteBinary.txt");
            fw.write(data.getBytes());
            System.out.println("File Created");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
