import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        FileWriter fw=null;
        String data ="This is data for File Writer Program";
        try {
            fw= new FileWriter("src/FileWriter.txt");
            fw.write(data);
            System.out.println("File Created");
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
