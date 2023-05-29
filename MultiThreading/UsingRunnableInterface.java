package MultiThreading;

class MyThread1 implements  Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class UsingRunnableInterface {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread1 r1= new MyThread1();
        Thread t2=new Thread(r1,"Thread B");
        t2.start();
    }
}
