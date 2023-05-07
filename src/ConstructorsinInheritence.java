package src;

class Base1{

    Base1(){
        System.out.println("I'm a constructor");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor with a value of x as : " + x);
    }
    public int x;
}

class Derived1 extends Base1{

    Derived1(){
//        super(0);
        System.out.println("I'm a dervied class constructor");
    }
    Derived1 (int x , int y){
        super(x);
        System.out.println("I'm an overloaded construcotr of Dervied with value of Y as :"+ y);
    }
    public int y;

}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I'm a child of derived constructor");
    }
    ChildOfDerived(int x, int y , int z){
        super(x,y);
        {
            System.out.println("I'm an overloaded constructor of dervied with value of y as: " + z);
        }
    }
}
public class ConstructorsinInheritence {
    public static void main(String[] args) {
//            Base1 b = new Base1();
//            Derived1 D = new Derived1(14,9);
            ChildOfDerived cd = new ChildOfDerived(12,13,15);



    }
}
