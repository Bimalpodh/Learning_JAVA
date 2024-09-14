class Myexcep extends Exception{

}
public class ExceptionHAndingUsingthrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("you are not eligible for vote");
        }
        else {
            System.out.println("You are eligible for vote");
        }
    }
    public static void main(String[] args) {
        /*throwing exception in method using throw in method*/
        validate(44);
        System.out.println("rest of the code");
        //user define exception using throw keyword
//        try{
//            throw new Myexcep();
//        }
//        catch (Myexcep e){
//            System.out.println(e);
//        }
    }
}
