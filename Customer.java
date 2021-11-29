public class Customer {
    private String custName;
    private String custAddress;
    private String custPhone;
    private String custEmail;
    private String custID;
    private Rental rental = new Rental();
    

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustPhone(String custPhone) {
        final int VALID_LEN = 10;
        final String INVALID_CUSTP = "0000000000";
        String cPhone = "";
        int len = custPhone.length();
        for(int x = 0; x < len; ++x)
        {
            if(Character.isDigit(custPhone.charAt(x)))
                cPhone += custPhone.charAt(x);
        }
            if(cPhone.length() != VALID_LEN)
                cPhone = INVALID_CUSTP;

        this.custPhone = cPhone;
    }

    public String getCustPhone() {

        custPhone = "(" + custPhone.substring(0,3) + ") " + 
            custPhone.substring(3,6) + "-" +
            custPhone.substring(6, 10);
        return custPhone;

    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Rental getRental() {
        return rental;
    }
}