package task3;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class eventcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = sc.nextLine();

        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime event = LocalDateTime.parse(input, format);
            LocalDateTime now = LocalDateTime.now();

            if (event.isBefore(now)) {
                System.out.println("The event has already passed");
                return;
            }

            Duration duration = Duration.between(now, event);
            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / 1440;
            long hours = (totalMinutes % 1440) / 60;
            long minutes = totalMinutes % 60;

            System.out.println("Time remaining until event:");
            System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes");
        } catch (Exception e) {
            System.out.println("Invalid input format");
        }
    }
}