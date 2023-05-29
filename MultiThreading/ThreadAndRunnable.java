package MultiThreading;

class MyThread2 extends Thread{
    MyThread2(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread3 implements  Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadAndRunnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread2 t1= new MyThread2("Thread A");
        t1.start();
        MyThread3 r1= new MyThread3();
        Thread t2=new Thread(r1,"Thread B");
        t2.start();
    }
}
