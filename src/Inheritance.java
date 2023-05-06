package src;

class Base{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in base class and I'm setting base now");
        this.x = x;
    }

    int x;


    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());

    }
}
