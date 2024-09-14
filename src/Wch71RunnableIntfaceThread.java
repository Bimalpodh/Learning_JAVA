class MyRunnable implements Runnable{
    public void run(){
        int i=1;
        while (i<20){
            System.out.println("I'm the 1st thread : 1");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    int i=1;
    public void run(){
        while (i<21){
            System.out.println("i'm in 2nd threat : 2");
            i++;
        }
    }
}
class MyRunnable3 implements Runnable{
    int i=1;
    public void run(){
        while (i<21){
            System.out.println("i'm in 3rd threat : 3");
            i++;
        }
    }
}
public class Wch71RunnableIntfaceThread {
    public static void main(String[] args)throws InterruptedException {
        String n=Thread.currentThread().getName();
        int i=1;
        while (i<21){
            System.out.println(n);
            i++;
        }
        MyRunnable t1=new MyRunnable();
        Thread gun=new Thread(t1);
        MyRunnable2 t2=new MyRunnable2();
        Thread gun1=new Thread(t2);
        MyRunnable3 t3=new MyRunnable3();
        Thread gun2=new Thread(t3);
        gun2.join(2);
        gun.start();
        gun1.start();
        gun1.join();

      int priorit = gun1.getPriority();
        System.out.println(priorit);
        gun2.start();
        try{
            gun1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(gun1.getState());

    }
}
