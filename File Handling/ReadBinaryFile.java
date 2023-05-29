import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        FileInputStream fr=null;
        int ch;
        try {
            fr=new FileInputStream("D:\\JAVA\\CollegeMCA\\src/CheckPrime.java");
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
