import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        Duration timeBetween;
        LocalTime timeIn, timeOut;
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("h[:mm] a");
        Scanner inputObj = new Scanner(System.in);

        Rental testRental = new Rental();

        System.out.print("Enter time out >> ");
        timeOut = LocalTime.parse(inputObj.nextLine(), parser);

        System.out.print("Enter time in >> ");
        timeIn = LocalTime.parse(inputObj.nextLine(), parser);

        System.out.println();
        
        System.out.println("Time out: " + timeOut);
        System.out.println("Time in: " + timeIn);

        testRental.setMinutes(timeOut, timeIn);

        System.out.println(testRental.getMinutes());

    }
}