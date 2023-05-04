package src;

class MyEmployee{
     private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id =1;
    }

    public int getId(){
        return id;
    }
}
public class Access_getter_Setter {
    public static void main(String[] args) {

        MyEmployee rishu = new MyEmployee();
//        rishu.id = 12;
//        rishu.name = "rishabh shukla";
        //These above 2 lines will throw an error due to private access
        //modifier


    }
}
