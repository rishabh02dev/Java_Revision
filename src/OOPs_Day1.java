package src;


class Employee{
    int id;
    String name;
    int salary ;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class OOPs_Day1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee rishabh = new Employee(); //Instatiating a new employee object
        //setting attributes for rishabh
        rishabh.id = 23;
        rishabh.name = "Rishabh Shukla";
        rishabh.salary = 34000;

        //Setting attributes for john
        Employee john = new Employee();
        john.id = 45;
        john.name = "john singh";
        john.salary = 23000;
        // Setting properties
//        System.out.println(rishabh.id);
//        System.out.println(rishabh.name);
        int salary = john.getSalary();
        int salaryy = john.salary;
        System.out.println(salaryy);

        rishabh.printDetails();
        john.printDetails();
        System.out.println();
        System.out.println(salary);

        //printing the properties and the attributes



    }
}
