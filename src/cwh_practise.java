import java.util.Scanner;
class cylinder {
    float r;
    float h;
    public void setradAndhgt(float rad,float height){
        r=rad;
        h=height;
    }

    public void getareaandper(float r,float h) {
        float area=r*r*2*3.14f;
        float per=4*r+2*h;
        float v=r*r*h*3.14f;
        System.out.println("the area of cylinder is :"+area);;
        System.out.println("the perimeter of cylinder is :"+per);
        System.out.println("the volume of cylinder is :"+v);
    }
}
public class cwh_practise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius of cylinder and height ::");
        float x=s.nextFloat();
        float h=s.nextFloat();
        cylinder c=new cylinder();
        c.setradAndhgt(x,h);
        c.getareaandper(x,h);

    }
}
