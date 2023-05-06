package src;

class Employees{
    int salary;

    public Employees(){
        salary = 10000;
    }

    public Employees(int salary){
        salary = 100000;
    }

    public Employees(int salary , String name){
        name = "rishabh shukla";
        salary = 12000;
    }


}




public class Sample_question_constructor {
//    Employees rishabh = new Employees();
public static void main(String[] args) {
//    Employees rishabh = new Employees(1000);
//    Employees rishabh = new Employees(100);
    Employees rishabh = new Employees(100, "rishabh");

}
}


