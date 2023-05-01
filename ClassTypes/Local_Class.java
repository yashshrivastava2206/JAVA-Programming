class OuterClass2{
    //When we want to implement method with in a method then this can achieve by using 'Local Class'.
    void display(){
        System.out.println("I'm Outer Class");
        class Local{
            void display(){
                System.out.println("Local Class");
            }
        }
        Local local = new Local();
        local.display();
    }
}
public class Local_Class {
    public static void main(String[] args) {
        OuterClass2 outer= new OuterClass2();
        outer.display();
    }
}
