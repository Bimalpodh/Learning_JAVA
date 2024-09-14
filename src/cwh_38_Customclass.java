class mobile{
    long phno;
    String sms;
    public void setphno(long num){
        phno=num;
    }
    public void getsms(){
        System.out.println("messe is forwrded to this :"+phno);
    }

}
//-----------THIS IS EMPLOYEE CLASSS----------
class employee extends mobile{
    int empid;
    String name;
    int sal;
     public void setsalary(int salary){
        sal=salary;
    }
    public void empdetails(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(sal);
    }

}

//this is main class
public class cwh_38_Customclass {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        employee e= new employee();
        employee hari=new employee();
        employee kam=new employee();
        mobile m=new mobile();
        kam.name="Kameshwar";
        kam.empid=125;
        kam.setsalary(564365);

        e.name="ram";
        e.empid=123;
        e.setsalary(563472);
        e.setphno(90781038);

        hari.name="hari";
        hari.empid=124;
        hari.setsalary(187366);
        hari.setphno(78955930);
        kam.empdetails();
        hari.empdetails();

    }
}
