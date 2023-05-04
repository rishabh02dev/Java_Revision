package src;

public class Method_Overloading {
      static void change(int a){
          a = 98;
    }

    static void foo(){
        System.out.println("Good Morning Brother!!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!!");
    }

    static void foo(int a , int b){
        System.out.println("Good morning " + a + "Bro !!" + b);
    }

    static void change2(int [] arr){
          arr[0] = 98;
    }
    public static void main(String[] args) {
      //  tellJoke();

        // Case 1 : It is the change in the element
//        int [] marks = {52, 53, 71, 89, 98, 94};
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is  " + x);
        //Case 2 : It is the change in the array

//        int [] marks = {52, 73, 77, 89, 94};
//        change2(marks);
//        System.out.println("The value of x after running change is" + marks[0]);

        //In arrays the refernce went there so it gets changed

        //Method Overloading

        foo();
        foo(300);
        foo(12, 14);

        //arguements are the acutal values whereas parameters the variables
        // which are made inside the method itself

    }
}
