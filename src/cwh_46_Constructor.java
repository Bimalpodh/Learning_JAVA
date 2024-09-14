class base1{
    int x;
    base1(){
        System.out.println("i'm a constructor");
    }
    base1(String v){
        System.out.println("hello "+v+" You are my Sonia");
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derive extends base1{
    int y;
    // constructor overloading

}
public class cwh_46_Constructor {
    public static void main(String[] args) {
        derive b=new derive();
        base1 c=new base1("katherin langford");
        int x=56;
        b.setX(x);
        System.out.println(b.getX());


    }
}
