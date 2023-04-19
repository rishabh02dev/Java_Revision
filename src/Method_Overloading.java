package src;

public class Method_Overloading {
      static void change(int a){
          a = 98;
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

        int [] marks = {52, 73, 77, 89, 94};
        change2(marks);
        System.out.println("The value of x after running change is" + marks[0]);

        //In arrays the refernce went there so it gets changed
    }
}
