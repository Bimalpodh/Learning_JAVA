class MyThreads extends Thread{
    public void run(){
     int i=8;
     while (i<4000){
         System.out.println("my thread t1 is running");
         System.out.println("I'm first thread");
         i++;
     }
    }
}
//class MyThreads2 extends Thread{
//    public void run(){
//        int i=8;
//        while (i<4000){
//            System.out.println("my thread t2 is Dancing");
//            System.out.println("I'm the second threads");
//            i++;
//        }
//    }
//}
class MyEve  extends Thread{
    public void run(){
        for(int i=1;i<21;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class Myodd  extends Thread{
    public void run(){
       for(int i=1;i<21;i++){
           if(i%2!=0){
               System.out.println(i);
           }
       }
    }
}
public class Wch70threads {
    public static void main(String[] args) {
//        MyThreads t1=new MyThreads();
//        MyThreads2 t2=new MyThreads2();
        Myodd t3=new Myodd();
        MyEve t4=new MyEve();
        t3.start();
        t4.start();

    }
}
