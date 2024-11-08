import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Task1
        LocalDate date = LocalDate.of( 2024, Month.JANUARY, 2);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy" );
        String dateFormat = date.format(dateTimeFormatter);

        //Task2shi3
        LocalTime time = LocalTime.of( 13,20);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm");
        String timeFormat = time.format(dateTimeFormatter2);
        System.out.println(dateFormat +" "+ timeFormat);

        //Task3
        LocalDateTime dateTime =  LocalDateTime.of(date,time);
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm" );
        String dateTimeFormat = dateTime.format(dateTimeFormatter3);
        System.out.println(dateTimeFormat);

        //Task4
        ZonedDateTime zonedDateTime1 = dateTime.atZone(ZoneId.of("America/Los_Angeles"));
        String zonedDateTimeF = zonedDateTime1.format(dateTimeFormatter3);
        System.out.println(zonedDateTimeF);

        //Task5
        LocalDateTime dateTime2 = dateTime
                .plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusMonths(1)
                .plusYears(1);
        String dateTime2Format = dateTime2.format(dateTimeFormatter3);
        System.out.println(dateTime2Format);

    }
}