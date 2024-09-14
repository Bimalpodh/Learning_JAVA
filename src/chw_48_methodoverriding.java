class A{
    void sum(int a,int b){
        int sum=a+b;
        System.out.println("the sum of two number is "+sum );
    }
}
class B extends A{
    @Override
    void sum(int a, int b) {
        super.sum(a, b);
        int sum=a+b;
        System.out.println(sum);
    }
}
class C{
    void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
}
public class chw_48_methodoverriding {
    public static void main(String[] args) {
        B a=new B();
        A b=new A();
        C c=new C();
        c.sum(75,89);
        //a.sum(54344,7655);
        b.sum(5663,653);

    }
}
