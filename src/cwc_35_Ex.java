import java.util.Scanner;
//method exercise
public class cwc_35_Ex {
    static void multTable(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number :");
        int x=s.nextInt();
        multTable(x);

    }
}
