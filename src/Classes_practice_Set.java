package src;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }



}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void callFriend(){
        System.out.println("Calling Vaibhav Singh...");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }

}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Run behind the enemy");
    }public void fire(){
        System.out.println("Fire if the enemy comes");
    }


}

class Circle{

    int radius;
    float pie;

    public float area(){
        return pie*radius*radius;
    }
    public float circumference(){
        return 2*pie*radius;
    }

}

public class Classes_practice_Set {
    public static void main(String[] args) {
        //problem 1
//        Employee1 harry = new Employee1();
//        harry.setName("codewithhaary");
//        System.out.println(harry.getName());
//        harry.salary =233;
//        System.out.println(harry.getSalary());


        //problem 2
//        CellPhone iphone = new CellPhone();
//        iphone.callFriend();
//        iphone.ringing();
//        iphone.vibrate();

        //

        //Problem 3
//        Square sq = new Square();
//        sq.side = 4;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());


        //problem 4

//        Rectangle rec = new Rectangle();
//        rec.length = 4;
//        rec.breadth = 2;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());


        //problem 5

//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.hit();
//        player1.run();


        //problem 6

        Circle cir = new Circle();
        cir.pie = 3.14f;
        cir.radius = 14;

        System.out.println(cir.area());
        System.out.println(cir.circumference());
    }
}
