public class Rental 
{
    private int equipmentNum;
    private String timeOut;
    private String timeIn;
    private int minutes;
    private double totalCost;
    private String date;

    final private String equipment[] = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "fishing tackle", "other"};
    
    public Rental(int minutes)

    {
        setMinutes(minutes);
    }

    public void setEquipmentNum(int equipmentNum) 

    {
        int equipmentType;

        if(equipmentNum < equipment.length)
            equipmentType = equipmentNum;
        else 
            equipmentType = equipment.length - 1;
    }

    public int getEquipmentNum() 
    
    {
        return equipmentNum;
    }

    public String getEquipNumString()

   {
      return equipment[equipmentNum];
   }           

    public void setMinutes(int minutes) 
    
    {
        this.minutes = minutes;

        int hoursRented = minutes / 60;
        double minutesOverHourCost = 0;
        if(minutes > 60) {
            int minutesOverHour = minutes - 60;
            minutesOverHourCost = minutesOverHour * 0.1;
        }

        if(minutes <= 60) 
        
        {
            totalCost = 30;
        } else {
            totalCost = 30 + minutesOverHourCost;
        }
    }

    public void setTimeIn(String timeIn) 
    
    {
        this.timeIn = timeIn;
    }

    public void setTimeOut(String timeOut) 
    
    {
        this.timeOut = timeOut;
    }

    public int getMinutes() 
    
    {
        return minutes;
    }

    public String getTimeIn() 
    
    {
        return timeIn;
    }

    public String getTimeOut()
    {
        return timeOut;
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

}
