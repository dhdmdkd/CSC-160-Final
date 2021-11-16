public class Rental {
    private String custName;
    private String custAddress;
    private int equipmentNum;
    private String custPhone;
    private String custEmail;
    private String timeOut;
    private String timeIn;
    private int minutes;
    private String custID;
    private float totalCost;

    final private String equipment[] = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "fishing tackle", "other"};
    
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
    
    public void setEquipmentNum(int equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;

        int hoursRented = minutes / 60;
        if(minutes > 60) {
            int minutesOverHour = minutes - 60;
            float minutesOverHourCost = minutesOverHour * 0.1;
        }

        if(minutes <= 60) {
            totalCost = 30;
        } else {
            totalCost = 30 + minutesOverHourCost;
        }
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCustEmail() {
        return custEmail;
    }
    
    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public int getEquipmentNum() {
        return equipmentNum;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }
}
