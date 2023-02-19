

/* Write a java program to encrypt a grade by adding 11 oto it . Decrypt it to show the correct grade */
public class EncryptGrade {
    public static void main(String[] args) {
        char grade = 'A' + 11;
        System.out.println(grade);


        // Method 1:
        grade =(char) (grade - 11);
        System.out.println(grade);
        /*
        // Method 2:
        System.out.printf("%c",grade);
        System.out.printf("\n");
        // Method 3:
        System.out.format("%c",grade);   */
    }
}
