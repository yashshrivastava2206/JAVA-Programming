interface LearnNew{
    void display();
    default void displayAgain(){
        System.out.println("Hello Yash...!");
    }
}
class Hello implements LearnNew{

    @Override
    public void display() {
        System.out.println("Hello Vikas...!");
    }
}
public class InterfaceEx3 {
    public static void main(String[] args) {
        Hello vikas = new Hello();
        vikas.display();
        vikas.displayAgain();
    }
}
