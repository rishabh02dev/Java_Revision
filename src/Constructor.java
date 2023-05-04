package src;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your name here";
    }

    public MyMainEmployee(String myName){
        id = 45;
        name = "myName";
    }

    public String getName() {return name; }
    public void setName(String n) {this.name = n; }
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}
public class Constructor {
    public static void main(String[] args) {
          MyMainEmployee rishu = new MyMainEmployee();
//        rishu.setId(12);
//        rishu.getId();
//        rishu.setName("rishabh shukla");
//        rishu.getName();

        System.out.println(rishu.getId());
        System.out.println(rishu.getName());
    }
}
