import java.util.Scanner;

public class LakesideLuxury {

    public static void main(String[] args) {
        
        promptCust();
        
        displayBanner();

    }

    public static void promptCust() {
        Scanner inputObj = new Scanner(System.in);
        Rental[] rentals = new Rental[3];

        for (int x = 0; x < rentals.length; ++x) {
            System.out.println("Enter information for Rental " + (x + 1));

            System.out.print("Enter customer ID >> ");
            rentals[x].setCustID(inputObj.nextLine());

            System.out.print("Enter customer name >> ");
            rentals[x].setCustName(inputObj.nextLine());

            System.out.print("Enter customer address >> ");
            rentals[x].setCustAddress(inputObj.nextLine());

            System.out.print("Enter customer phone number >> ");
            rentals[x].setCustPhone(inputObj.nextLine());

            System.out.print("Enter customer email >> ");
            rentals[x].setCustEmail(inputObj.nextLine());

        }
    }

    public static void displayBanner() {
        System.out.println(
            "***********************************************" + "\n" + "*" +
            "    Lakeside Luxury, Life with No Worries    " + "*" + "\n" +
            "***********************************************"
        );
    }

}