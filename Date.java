public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getter methods
    public int getDay() 
    {
        return this.day;
    }

    public int getMonth() 
    {
        return this.month;
    }

    public int getYear() 
    {
        return this.year;
    }

    // setter methods
    public void setDay(int day) 
    {
        this.day = day;
    }

    public void setMonth(int month) 
    {
        this.month = month;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    // setDate method
    public void setDate(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    @Override
    public String toString() 
    {
        return (this.day + "/" + this.month + "/" + this.year);
    }

}
