class MyException extends Exception{

}
public class MyExceptionHandling {
    public static void main(String[] args) {
        //without exception handling
//        int data1=15/0;
//        System.out.println("execute the rest of code");
        //with exception handling
//        try{
//            int data=56/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("you are in arithmetic exception");
//
//        }
//        //arrayIndexBoundException
//        int arr[]=new int[5];
//        arr =new int[]{1,5,6,7,8,8};
//        try{
//            int d=arr[10];
//        }
//        catch (Exception e){
//            System.out.println(e);
//            System.out.println("you are in exception");
//
//        }
//        System.out.println("you are my exception");
        /*----User defined Exception in this Exception we have to create a class
        //which is inherited from Exception class and create instance of that on try bloc*/
//       try{
//           throw new MyException();
//       }
//       catch (Exception e){
//           System.out.println(e);
//           System.out.println("i print Exception");
//       }

        try{
            try{
                int x=67/0;
            }
            catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("u r in arithematic exception");
            }
            try{
                int arr[]={3,5,6,56,67};
                int d=arr[6];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
            System.out.println("out of coverage");
        }
    }
}
