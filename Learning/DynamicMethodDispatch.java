
class Watch {
    private int hr=0;
    private int min=0;

    public void updateTime(int hr,int min){
        this.hr=hr;
        this.min=min;
    }
    public void getTime(){
        System.out.println("The time on Watch is "+hr+":"+min);
    }
    public void restart(){
        this.hr=0;
        this.min=0;
        System.out.println("Time "+hr+":"+min);
    }
}
class SmartWatch extends Watch {
    private int hr=0;
    private int min=0;

    public void updateTime(int hr,int min){
        this.hr=hr;
        this.min=min;
    }
    public void getTime(){
        System.out.println("The time on SmartWatch is "+hr+":"+min);
    }
    public void onStopWatch(){
        System.out.println("Start stopWatch.....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        Watch old = new Watch();
        old.updateTime(5,34);
        old.getTime();

        System.out.println("-----------------------------------------");
        Watch newModel = new SmartWatch();  //Allowed ,We can make object of child class in reference to parent class
        newModel.getTime();                 //Valid
        newModel.updateTime(7,34);  //Valid
        newModel.getTime();                 //Valid
        newModel.restart();                 //Valid- run all method of parent class
//        newModel.onStopWatch();   //Invalid on not allowed - We only use the method which is present in parent class

        System.out.println("-----------------------------------------");
        SmartWatch newSW= new SmartWatch();
        newSW.onStopWatch();                //Valid
    }
}
