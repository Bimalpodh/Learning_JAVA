

class   employee1{
    int sal;
    String name;
    // parameterize constructor
    public employee1(int salary,String name){
        sal=salary;
        this.name=name;

        System.out.println("the salary is :"+sal);
        System.out.println("the name of employee is :"+name);
    }

}
public class cwh_constructor {
    public static void main(String[] args) {
        employee1 Ramesh=new employee1(123467856,"ramesh");
        employee1 kam=new employee1(786748,"Ashu");
    }
}
