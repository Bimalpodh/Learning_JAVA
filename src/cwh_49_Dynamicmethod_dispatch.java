class phones{
    public void greet(){
        System.out.println("hello i'm groot");
    }
    public void mssg(){
        System.out.println("hello this is my message ");
    }

}
class smartphone extends phones{
    void good(){
        System.out.println("you are a good girl :");
    }
}
class blackberry extends smartphone{
    void getmess(){
        System.out.println("you are a simple phone :");
    }
}
public class cwh_49_Dynamicmethod_dispatch {
    public static void main(String[] args) {
        phones obj= new smartphone();//method dispatcher
        smartphone s=new blackberry();
        obj.mssg();
        s.greet();
        s.good();

    }
}
//--------------------------
