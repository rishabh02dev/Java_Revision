package src;

public class Logical_Operators {
    public static void main(String[] args) {
        System.out.println("For logical AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;
//        if(a && b && c){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

        // for logical OR
        if(a|| b){
            System.out.println("YES");
        }else{
            System.out.println("False");
        }

        //For logical NOT

        System.out.println("FOR LOGICAL NOT");
        System.out.print("NOT(A) is " );
        System.out.println(!a);
        System.out.print("NOT(B) is  ");
        System.out.println(!b);

    }
}
