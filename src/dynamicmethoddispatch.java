package src;

class Phone {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends Phone {
    public void swagat(){
        System.out.println("Apka swagat haii");
    }
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone(); //yes it is allowed

        obj.greet();
        obj.on(); 

    }
}
