
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinary {
    public static void main(String[] args) {
        FileInputStream fr=null;
        FileOutputStream fw=null;
        int ch;
        try {
            fr=new FileInputStream("src/image.jpg");
            fw=new FileOutputStream("src/image1.jpg");
            while((ch=fr.read())!=-1){
                fw.write(ch);
            }
            System.out.println("File Copied");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
