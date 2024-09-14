public class ExceptionThrows {

    public static int dividenum(int n,int m)throws ArithmeticException{
        int div=n/m;
        return div;
    }
    /*public ExceptionThrows(int s, int x){
        int sum=s+x;
        System.out.println(sum);
        return;
    }
    public ExceptionThrows(){
        int s=7,x=8;
        int m=s*x;
        System.out.println(m);
    }*/


    public static void main(String[] args) {
        ExceptionThrows ob=new ExceptionThrows();
//        ExceptionThrows o=new ExceptionThrows(45,78);
        try {
            System.out.println(ob.dividenum(5,0));
        }
        catch (ArithmeticException e){
            System.out.println("Number can not be divided by zero(0)");
        }
        System.out.println("rest of the code");

    }
}
