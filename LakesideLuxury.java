import java.util.Scanner;

public class LakesideLuxury {

    public static void main(String[] args) {

        // Declare 3 customer objects
        Customer[] cust = new Customer[3];
        int x;

        // Loop to take input and populate data fields in objects
        for(x = 0; x < cust.length; ++x)  {
            System.out.println("Enter information for Customer " + (x + 1));
            // object in Customer array gets populated here
            cust[x] = promptCust();
        }
        
        displayBanner();

        // Loop to display data from Customer object array
        for(x = 0; x < cust.length; ++x)
            displayCustInfo(cust[x]);
    }

    // This method prompts for input, takes input, stores it in temporary
    // object, then returns that temporary object to main() where it
    // is stored in the Customer object array.
    public static Customer promptCust() {
        Scanner inputObj = new Scanner(System.in);
        Customer tempCust = new Customer();

        System.out.print("Enter customer ID >> ");
        tempCust.setCustID(inputObj.nextLine());

        System.out.print("Enter customer name >> ");
        tempCust.setCustName(inputObj.nextLine());

        System.out.print("Enter customer phone number >> ");
        tempCust.setCustPhone(inputObj.nextLine());

        System.out.print("Enter customer email address >> ");
        tempCust.setCustEmail(inputObj.nextLine());

        System.out.print("Enter customer mailing address >> ");
        tempCust.setCustAddress(inputObj.nextLine());

        System.out.print("Enter number of minutes rented >> ");
        tempCust.setRental();
        

        return tempCust;
    }

    public static void displayBanner() {
        System.out.println("\n\n" +
            "***********************************************" + "\n" + "*" +
            "    Lakeside Luxury, Life with No Worries    " + "*" + "\n" +
            "***********************************************" + "\n\n"
        );
    }


    // Method to start displaying output of customer object data
    // Still needs work to properly format stuff I think
    public static void displayCustInfo(Customer tempCust) {
        System.out.println("Customer ID: " + tempCust.getCustID());
        System.out.println("Customer Name: " + tempCust.getCustName());
        System.out.println("Customer Phone: " + tempCust.getCustPhone());
        System.out.println("Customer Email: " + tempCust.getCustEmail());
        System.out.println("Customer Address: " + tempCust.getCustAddress());
    }
}