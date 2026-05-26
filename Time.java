public class Time {

    // Variables
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) 
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getter methods
    public int getHour() 
    {
        return this.hour;
    }

    public int getMinute() 
    {
        return this.minute;
    }

    public int getSecond() 
    {
        return this.second;
    }

    // setter methods
    public void setHour(int hour) 
    {
        this.hour = hour;
    }

    public void setMinute(int minute) 
    {
        this.minute = minute;
    }

    public void setSecond(int second) 
    {
        this.second = second;
    }

    // setTime method
    public void setTime(int hour, int minute, int second) 
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // nextSecond method
    public Time nextSecond() 
    {
        this.second++;
        if (this.second >= 60) 
        {
            this.second = 0;
            this.minute++;

            if (this.minute >= 60) 
            {
                this.minute = 0;
                this.hour++;

                if (this.hour >= 24) 
                {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    // previousSecond method
    public Time previousSecond() 
    {
        this.second--;
        if (this.second < 0) 
        {
            this.second = 59;
            this.minute--;

            if (this.minute < 0) 
            {
                this.minute = 59;
                this.hour--;

                if (this.hour < 0) 
                {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    // toString method
    @Override
    public String toString() 
    {
        return (this.hour + ":" + this.minute + ":" + this.second);
    }

}
