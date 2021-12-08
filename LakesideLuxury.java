import java.util.Scanner;

public class LakesideLuxury {

    public static void main(String[] args) {

        final int NUM_CUSTS = 3;
        int x;

        // Declare 3 customer and rental objects via Object Arrays
        Customer[] cust = new Customer[NUM_CUSTS];
        Rental[] rental = new Rental[NUM_CUSTS];


        // Loop to take input and populate data fields in objects
        for(x = 0; x < NUM_CUSTS; ++x)  {
            System.out.println("Enter information for Customer " + (x + 1));
            // object in Customer and Rental arrays gets populated here
            // doing a parallel object arrays thing, instead of trying
            // to do an object within an object type of thing.
            cust[x] = promptCust();
            rental[x] = promptRental();
            System.out.println();
        }

        displayBanner();

        // Loop to display data from Customer object array
        for(x = 0; x < NUM_CUSTS; ++x) {
            System.out.println("Information for Customer " + (x + 1));
            displayCustInfo(cust[x], rental[x]);
        }
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

        return tempCust;
    }

    // Created this as a separate method just to break up the
    // large block of input statements.
    public static Rental promptRental() {
        Scanner inputObj = new Scanner(System.in);
        Rental tempRental = new Rental();

        String[] equipType = tempRental.getEquipType();
        for(int x = 0; x < equipType.length; ++x) {
            System.out.println((x+1) + ") " + equipType[x]);
        }

        System.out.print("Enter equipment item number >> ");
        tempRental.setEquipmentNum((inputObj.nextInt() - 1));
        inputObj.nextLine();

        System.out.print("Enter rental date (MMDDYYYY) >> ");
        tempRental.setDate(inputObj.nextLine());

        System.out.print("Enter out time (H[:MM] AM/PM) >> ");
        tempRental.setTimeOut(inputObj.nextLine());

        System.out.print("Enter return time (H[:MM] AM/PM) >> ");
        tempRental.setTimeIn(inputObj.nextLine());

        tempRental.setMinutes();

        System.out.print("Enter coupon code if you have one, otherwise leave blank >> ");

        tempRental.setCoupon(inputObj.nextLine());
        return tempRental;
    }

    public static void displayBanner() {
        System.out.println("\n\n" +
            "***********************************************" + "\n" + "*" +
            "    Lakeside Luxury, Life with No Worries    "   + "*"  + "\n" +
            "***********************************************" + "\n"
        );
    }

    // Method to start displaying output of customer object data
    // Still needs more work to display all information and formatting
    public static void displayCustInfo(Customer tempCust, Rental tempRental) {
        System.out.println("Customer ID: " + tempCust.getCustID() + "\t\tCustomer Name: " + tempCust.getCustName());
        System.out.println("Customer Phone: " + tempCust.getCustPhone() + "\tCustomer Email: " + tempCust.getCustEmail());
        System.out.println("Customer Address: " + tempCust.getCustAddress());
        System.out.println("=========================================================================");
        System.out.println("Rental date: " + tempRental.getDate() + "\tTime out: " + tempRental.getTimeOut() + "\tTime in: " + tempRental.getTimeIn());
        System.out.println("Equipment Rented: " + tempRental.getEquipNumString() + "\tTime rented: " + tempRental.getMinutes());
        System.out.println("Coupon Entered: " + tempRental.getCoupon());
        System.out.println("Total cost: " + tempRental.getTotalCost());
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println();
        System.out.println();
    }
}