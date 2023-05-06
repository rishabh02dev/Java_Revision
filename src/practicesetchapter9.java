package src;

import org.w3c.dom.css.Rect;

class Cylinder{
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int radius;
    private int height;

    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }

    public double volume(){
        return 3.14*radius*radius*height;
    }

    class Rectangle{
        private int length;
        private int breadth;



        public Rectangle() {
            this.length = 4;
            this.breadth = 5;
        }

        public Rectangle(int length, int breadth) {
            this.length = 10;
            this.breadth = 12;
        }
        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }


    }


}
public class practicesetchapter9 {
    public static void main(String[] args) {

        //problem 1
//        Cylinder myCylinder = new Cylinder();

//
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.getHeight());

        //problem 2
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.surfaceArea());

        //problem 3

//        Cylinder myCylinder = new Cylinder(12,9);
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

//        Rectangle r = new Rectangle(12,56);
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());


    }
}
