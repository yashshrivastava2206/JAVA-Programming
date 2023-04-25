package Inherit;
interface MotorCycle{
    int discBreak=0;
    void increaseSpeed(int inc);
    void decreaseSpeed(int desc);
}
interface Location{
    void currentLocation(String curr);
    void destination(String dest);
}
class Pulsar implements MotorCycle,Location {

    int speed;
    String currlocation;
    String destLocation;
    @Override
    public void increaseSpeed(int inc) {
        speed=speed+inc;
    }

    @Override
    public void decreaseSpeed(int desc) {
        speed=speed-desc;
    }
    void pushDiscBreak(){
        speed=discBreak;
    }
    int showSpeed(){
        return speed;
    }

    public String showCurrentLocation(){
        return currlocation;
    }

    @Override
    public void currentLocation(String curr) {
        currlocation=curr;
    }

    @Override
    public void destination(String dest) {
        destLocation=dest;
    }
    public String showDestinationLocation(){
        return destLocation;
    }

}
public class MultipleInheritance {
    public static void main(String[] args) {
        Pulsar bike= new Pulsar();
        System.out.println("Speed:"+bike.showSpeed());
        bike.increaseSpeed(140);
        System.out.println("Speed:"+bike.showSpeed());
        bike.decreaseSpeed(70);
        System.out.println("Speed:"+bike.showSpeed());
        bike.pushDiscBreak();
        System.out.println("Speed:"+bike.showSpeed());
        bike.currentLocation("Delhi");
        System.out.println("Current Location:"+bike.showCurrentLocation());
        bike.destination("USA");
        System.out.println("Destination:"+bike.showDestinationLocation());
    }
}
