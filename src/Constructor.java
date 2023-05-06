package src;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your name here";
    }

    public MyMainEmployee(String name){
        name = "Your name here";
    }
    //doing method-overloading with constructors

    public MyMainEmployee(String myName, int myid){
        id = myid;
        name = myName;
    }

    public String getName() {return name; }
    public void setName(String n) {this.name = n; }
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}
public class Constructor {
    public static void main(String[] args) {
//          MyMainEmployee rishu = new MyMainEmployee("Rishabh Shukla", 12);
//          MyMainEmployee rishu = new MyMainEmployee();
            MyMainEmployee rishu = new MyMainEmployee("rishu");
//        rishu.setId(12);
//        rishu.getId();
//        rishu.setName("rishabh shukla");
//        rishu.getName();


        System.out.println(rishu.getId());
        System.out.println(rishu.getName());
    }
}
