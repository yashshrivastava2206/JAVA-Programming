class OuterClass{
    void display(){
        System.out.println("I'm Outer Class");
    }
    class InnerClass{
        void display(){
            System.out.println("I'm Inner Class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer= new OuterClass();
        outer.display();
        //Making Object of Inner Class we use object of Outer class with 'new' keyword;
        // Inner class is only exist if outer class is exist in memory and inner obj is created
        // by object of outer class.
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.display();
    }
}
