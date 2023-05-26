package mentoring;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InterviewTimeTable {
    public static void main(String[] args) {
        printDate(LocalDate.now());
        printDate(LocalDate.now().plusDays(1));
    }

    private static void printDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}
