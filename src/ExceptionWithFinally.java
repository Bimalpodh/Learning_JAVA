public class ExceptionWithFinally {
    public static void main(String[] args) {
//        try {
//            int a=56/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("you are out of exception");
//        }
        try{
            System.out.println("u r inside the try block");
            int a=55/0;
        }
        catch(ArithmeticException e){
            System.out.println("exception handle");
            System.out.println(e);
        }
        finally {
            System.out.println("Don't Worry just enjoy the code");
        }
        System.out.println("rest of the code is executed");
    }
}
