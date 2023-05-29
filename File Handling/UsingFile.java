import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFile {
    public static void main(String[] args) {
        File f= new File("D:\\JAVA\\CollegeMCA\\src/CheckPrime.java");
        FileReader fr;
        int ch;
        if(f.exists()){
            try {
                fr=new FileReader(f);
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
}
