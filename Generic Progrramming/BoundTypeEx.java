package GenericProgramming;
class A{
    void display(){
        System.out.println("Class A");
    }
}
class B extends  A{
    @Override
    void display(){
        System.out.println("Class B");
    }
}
class C<T extends A>{
    T a;
    public C(T a){
        this.a=a;
    }

    void display(){
        System.out.println("Class C");
    }
}
public class BoundTypeEx {
    public static void main(String[] args) {
        A a= new A();
        a.display();
        B b= new B();
        b.display();
        C c1= new C(a);
        c1.display();
        C<B> c2= new C<>(b);
        c2.display();
    }
}
