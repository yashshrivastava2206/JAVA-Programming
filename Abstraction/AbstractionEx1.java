package Abstraction;

abstract class Time{
    public abstract void setTime(int hr,int min,String AmOrPm);
    public abstract void showTime();
    public void info(){
        System.out.println("AM : Morning");
        System.out.println("PM : Day ");
    }
}
class Watch extends Time{
    private int hr;
    private int min;
    private String AmOrPm;
    @Override
    public void setTime(int hr, int min, String AmOrPm) {
        this.hr=hr;
        this.min=min;
        this.AmOrPm=AmOrPm;
    }

    @Override
    public void showTime() {
        System.out.println(hr+":"+min+" "+AmOrPm);
    }
}
public class AbstractionEx1 {
    public static void main(String[] args) {
        //Time obj=new Time();  Not Allowed
        Time time=new Watch(); //Up Casting
        time.info();
        time.showTime();
        time.setTime(12,14,"AM");
        time.showTime();
        Watch time1=new Watch();
        time1.setTime(11,34,"PM");
        time1.showTime();
        Time timeAgain= new Time() {
            public int hr;
            public int min;
            public String AmOrPm;
            @Override
            public void setTime(int hr, int min, String AmOrPm) {
                this.hr=hr;
                this.min=min;
                this.AmOrPm=AmOrPm;
            }

            @Override
            public void showTime() {
                System.out.println(hr+":"+min+" "+AmOrPm);
            }
        };
        timeAgain.setTime(9,34,"AM");
        timeAgain.showTime();
    }
}
