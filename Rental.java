public class Rental 
{
    private int equipmentNum;
    private String timeOut;
    private String timeIn;
    private int minutes;
    private float totalCost;

    final private String equipment[] = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "fishing tackle", "other"};
    
    public Rental(int minutes)

    {
        setMinutes(minutes);
    }

    public void setEquipmentNum(int equipmentNum) 

    {
        if(equipmentNum < equipment.length)
            equipmentType = equipmentNum;
        else 
            equipmentType = equipment.length - 1;
    }

    public int getEquipmentNum() 
    
    {
        return equipmentNum;
    }

    public String getEquipNUmString()

   {
      return equiptment[equipmentNum];
   }           

    public void setMinutes(int minutes) 
    
    {
        this.minutes = minutes;

        int hoursRented = minutes / 60;
        if(minutes > 60) {
            int minutesOverHour = minutes - 60;
            float minutesOverHourCost = minutesOverHour * 0.1;
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
}
