import java.time.*;
import java.time.format.DateTimeFormatter;

public class Rental 
{
    private int equipmentNum;
    private LocalTime timeOut;
    private LocalTime timeIn;
    private long minutes;
    private String date;
    private String coupon;
    private boolean couponValid = false;

    DateTimeFormatter parser = DateTimeFormatter.ofPattern("h[:mm] a");

    private final String[] equipment = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "fishing tackle", "other"};
    
    public void setEquipmentNum(int equipmentNum)
    {
        int equipmentType;

        if(equipmentNum < equipment.length)
            equipmentType = equipmentNum;
        else 
            equipmentType = equipment.length - 1;

        this.equipmentNum = equipmentType;
    }
    
    public String[] getEquipType(){
        return equipment;
    }
    

    public String getEquipNumString()
    {
        return equipment[equipmentNum];
    }           

    // This timeIn setter takes a string input and parses
    // that input to create a LocalTime timeIn object and
    // store it (not working yet)
    public void setTimeIn(String timeIn)
    {
        this.timeIn = LocalTime.parse(timeIn, parser);
    }

    // This timeOut setter takes a string input and parses
    // that input to create a LocalTime timeOut object and
    // store it (not working yet)
    public void setTimeOut(String timeOut) 
    {
        this.timeOut = LocalTime.parse(timeOut, parser);
    }

    // altered this timeIn getter to convert the LocalTime
    // object to a string for output
    public String getTimeIn()
    {
        return timeIn.toString();
    }

    // altered this timeOut getter to convert the LocalTime
    // object to a string for output
    public String getTimeOut()
    {
        return timeOut.toString();
    }

    public void setMinutes()
    {
        Duration timeBetween = Duration.between(timeOut, timeIn);
        minutes = timeBetween.toMinutes();
    }

    public long getMinutes() 
    {
        return minutes;
    }

    public void setDate(String date)
    {
        final int VALID_LEN = 8;
        final String INVALID_DATE = "00000000";
        String rDate = "";
        int len = date.length();
        for(int x = 0; x < len; ++x)
        {
            if(Character.isDigit(date.charAt(x)))
                rDate += date.charAt(x);
        }
            if (rDate.length() != VALID_LEN)
                rDate = INVALID_DATE;
        
        this.date = rDate;
    }

    public String getDate()
    {
        date = date.substring(0,1) + "-" +
            date.substring(1,2) + "-" +
            date.substring(2,6);
        return date;
    }

    public String getCoupon()
    {
        return coupon;
    }

    public void setCoupon(String coupon)
    {
        if(coupon.equals("10OFF")) {
            this.coupon = coupon;
            couponValid = true;
        } else if(coupon.equals("")) {
            this.coupon = "No coupon entered";
        } else {
            this.coupon = "INVALID";
        }
    }
    
    // Created this total getter and moved the code from
    // the set minutes method because we'll need to return
    // both minutes and total cost for our output
    public double getTotalCost() {
        double totalCost;
        double minutesOverHourCost = 0;
        if(minutes > 60) {
            int minutesOverHour = (int) minutes - 60;
            minutesOverHourCost = minutesOverHour * 0.1;
        }

        if(minutes <= 60) 
        {
            totalCost = 30;
        } else {
            totalCost = 30 + minutesOverHourCost;
        }

        if(couponValid) {
            totalCost = totalCost - (totalCost * 0.1);
        }

        return totalCost;
    }
}
