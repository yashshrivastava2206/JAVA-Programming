package ClassPractice;

class CellPhone{
    public void ring(){
        System.out.println("Ringing......");
    }
     public void vibrate(){
        System.out.println("Vibrating.....");
    }
}
public class CustomClass2 {
    public static void main(String[] args) {
        CellPhone action= new CellPhone();
        action.ring();
        action.vibrate();
    }
}
