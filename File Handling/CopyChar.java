
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChar {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        int ch;
        try {
            fr=new FileReader("src/FileWriter.txt");
            fw= new FileWriter("src/WriteBinary1.txt");
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
