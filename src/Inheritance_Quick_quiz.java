package src;

 class Animal {
     public void bark() {
         System.out.println("Animals used to bark");
     }

     public void run() {
         System.out.println("Animlas used to run");
     }

     public void bite() {
         System.out.println("They can bite you too");
     }

     public void hello() {
         System.out.println("this is the base class for animals");
     }

 }

    class Dog extends Animal{

        public void living(){
            System.out.println("Dogs are living being");
        }

        public void eating(){
            System.out.println("Dogs are carnivores in nature in general");
        }
    }


public class Inheritance_Quick_quiz {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.bark();

        Dog americanBully = new Dog();
        americanBully.eating();



    }

}
