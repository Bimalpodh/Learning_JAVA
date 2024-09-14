import java.lang.String;
//Base class
class Base{
    int x;
    void setX(int x){
        this.x=x;
    }
    int getX(){
        return x;
    }
}
// derived class
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
//-------------------------------------//
class phone{
    String s;
    void setmessages(String s){
        this.s=s;
    }
    String getmessages(){
        return s;
    }
}
class Message extends phone{
    String x;
    void getConnect(){
        x=s;
        System.out.println("Connextion Established");
    }

}
//Main class is here
public class cwh_45_Inheritance {
    public static void main(String[] args) {
        int x;
        Base b= new Base();
        Derived d=new Derived();
        d.setX(56);
        System.out.println(d.getX());
        Message m=new Message();
        m.setmessages("you are my darling");
        System.out.println(m.getmessages());
        m.getConnect();
    }
}
