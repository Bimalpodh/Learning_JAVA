class ekclass{
    int x;
    ekclass(int i){
        this.x=i;
        System.out.println(x);
    }
}

public class chw_47_thisSuperkeyword {
    public static void main(String[] args) {
        ekclass e=new ekclass(5);
        ekclass d=new ekclass(0);

    }
}
