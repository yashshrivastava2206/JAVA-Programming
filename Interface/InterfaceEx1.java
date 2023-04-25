interface MotorCycle{
    int discBreak=0;
    void increaseSpeed(int inc);
    void decreaseSpeed(int desc);
}
class Yamana implements MotorCycle{
    private int speed;
    @Override
    public void increaseSpeed(int inc) {
        speed=speed+inc;
    }

    @Override
    public void decreaseSpeed(int desc) {
        speed=speed-desc;
    }
    public int showSpeed(){
        return speed;
    }
    public void pushDiscBreak(){
        speed=discBreak;
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        Yamana bike= new Yamana();
        bike.increaseSpeed(100);
        System.out.println(bike.showSpeed());
        bike.decreaseSpeed(20);
        System.out.println(bike.showSpeed());
        bike.pushDiscBreak();
        System.out.println(bike.showSpeed());

    }

}
