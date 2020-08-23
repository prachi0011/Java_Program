package prachi.stringpractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        //format y-M-d or yyyy-MM-d
        String string = "2020-08-21";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);

    }
}
