//First Program of inheritance

class AC{
	String company;
	String model;
	float capacity;
	//AC(){};	
	AC(String company,String model, float capacity){
		this.company=company;
		this.model=model;
		this.capacity=capacity;
	}
	String display() {
		return "AC [company=" + company + ", model=" + model + ", capacity=" + capacity + "]";
	}
	
}
class SmartAC extends AC{
	boolean wifi;
	boolean iotEnable;
	public SmartAC(String company,String model, float capacity,boolean wifi, boolean iotEnable) {
		super(company,model,capacity);
//		super.company=company;
//		super.model=model;
//		super.capacity=capacity;
		this.wifi = wifi;
		this.iotEnable = iotEnable;
	}
	String getDisplay() {
		return "SmartAC [Company=" + company + ", Model=" + model
				+ ", Capacity=" + capacity + ",Wifi=" + wifi + ", IotEnable=" + iotEnable + "]";
	}
	
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC obj=new AC("SAMSUNG","2022",7.5f);
		System.out.println(obj.display());
		SmartAC obj1= new SmartAC("SAMSUNG","2022",7.5f,true,true);
		System.out.println(obj1.getDisplay());
	}

}
