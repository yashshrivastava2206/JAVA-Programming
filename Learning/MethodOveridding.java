
class First{
    public void run(){
        System.out.println("Run Code of Class First");
    }

}
class Second extends First{
    @Override
    public void run(){
        System.out.println("Run Code of class Second");
    }
}
public class MethodOveridding {
    public static void main(String[] args) {
        First a= new First();
        a.run();
        Second b = new Second();
        b.run();
    }
}
