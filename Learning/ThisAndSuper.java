
class FirstClass{
    private int a;
//    public FirstClass() {
//        System.out.println("First Class Constructor");
//    }

    public FirstClass(int a){
        this.a=a;                   //Using this keyword
    }
    public void run(){
        System.out.println("Run");
    }
    public void display(){
        System.out.println(this.a);
    }
}
class secondClass extends FirstClass{
    public secondClass(int a){

        super(a);

        int b=a;

    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        secondClass twoClass =new secondClass(111);
        twoClass.display();
    }
}
