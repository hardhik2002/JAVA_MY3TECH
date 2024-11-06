class Employee{
    public float employeeSalary(){
    float salary=40000;
    return salary;
}
}
public class Inheritance extends Employee {
    int bonous=1000;
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        Employee e=new Employee();
        System.out.println(e.employeeSalary());
        System.out.println(i.bonous);
        
    }    
}
