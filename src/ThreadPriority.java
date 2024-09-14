/*in java 3 constant defined in Thread class
 1.public static int MIN_PRIORITY    def=(1)
 2. public static int NORM_PRIORITY  def=(5)
 3.public static int MAX_PRIORITY    def=(10)
 */
public class ThreadPriority implements Runnable{
    public void  run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" Thread is Running "+i);
        }
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" Thread is Running "+i);
        }

    }
    public static void main(String[] args) {
        ThreadPriority p=new ThreadPriority();
        Thread t1=new Thread(p);
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2=new Thread();
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3=new Thread();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("the priority of 1st thread is "+t1.getPriority());
    }
}
