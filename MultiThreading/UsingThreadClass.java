package MultiThreading;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class UsingThreadClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1= new MyThread("Thread A");
        t1.start();

    }
}
