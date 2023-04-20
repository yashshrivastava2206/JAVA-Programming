package Inheritance;

class Watch{
	int hour;
	int minute;
	int second;
	void setTime(int hour,int minute,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	void showTime() {
		System.out.println(hour+":"+minute+":"+second);
	}
}
class SmartWatch extends Watch{
	private String model;
	void model(String model) {
		this.model=model;
	}
	public void displayTime() {
		System.out.println("SmartWatch [model=" + model + ", hour=" + hour + ", minute=" + minute + ", second=" + second + "]");
	}
	
}
public class WatchEx {

	public static void main(String[] args) {
		Watch watch=new Watch();
		watch.showTime();
		watch.setTime(12, 47, 30);
		watch.showTime();
		SmartWatch smartWatch=new SmartWatch();
		smartWatch.showTime();
		smartWatch.setTime(10, 20, 8);
		smartWatch.showTime();
		smartWatch.model("TITAN");
		smartWatch.displayTime();
	}

}
