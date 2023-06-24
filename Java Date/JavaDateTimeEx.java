import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDate {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
