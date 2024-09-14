
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
//class guess{
//    public int num;
//    void guess(int n){
//        this.num=n;
//    }
//    void takeuserinput(){
//        System.out.println("enter the guess number :");
//
//    }
//    void iscorrect(){
//
//
//
//    }
//
//}

public class cwh_43_exercise3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int f=0;
        Random r=new Random();
        int max=100,min=0,count=0;
        int random=r.nextInt(max-min+1);
        System.out.println("you have only 5 chances :");
        System.out.println("Enter the number between o to 100");
        int i,j;
        for(i=1;i<6;i++){
            if(i<6){
                for(j=1;j<6;j++){
                    count++;
                    System.out.println("Enter the guess number :");
                    int x=s.nextInt();
                    if(x==random){
                        System.out.println("your guess is right");
                        System.out.println("on the chance is = "+count);
                        System.out.println("the number is : "+random);
                        f=1;
                        break;
                    } else if (x > random) {
                        System.out.println("you enter number is slightly bigger :");
                        System.out.println("please re Enter the number:");
                    }
                    else{
                        System.out.println("you enter slightly smaller number :");
                        System.out.println("please re Enter the number:");
                    }

                }
                if(count==5){
                    System.out.println("the number is : "+random);
                    System.out.println(": your chances is over :");
                    break;
                } else if(f==1) {
                    break;
                }
            }
        }
    }
}
