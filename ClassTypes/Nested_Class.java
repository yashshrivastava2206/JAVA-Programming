package ClassPractice;

class OuterClass1{
    void display(){
        System.out.println("I'm Outer Class");
    }
    //We use static class to make a class nested in a class if we didn't use static then the
    //class is 'Inner Class'
    static class NestedClass{
        void display(){
            System.out.println("I'm Inner Class");
        }
    }
}
public class Nested_Class {
    public static void main(String[] args) {
        //Nested class doesn't need to create or existence of outer class object.
        OuterClass1.NestedClass nested= new OuterClass1.NestedClass();  //Nested Class
        nested.display();
    }
}
