package src;

import java.util.Scanner;

public class For_loops {
    public static void main(String[] args) {
//        for(int i = 0; i<=10; i++){
//            System.out.println(i);
//        }

        // 2n = Even Numbers = 0, 2, 4 , 6, 8;
        //2n+1 = Odd Numbers;
//        int n = 3;
//        for (int i = 0 ; i<n; i++){
//            System.out.println(2*i+1);
//        }


        //Decrementing for loops in java

//        for (int i =5; i>0; i--){
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of limit (n) :");
        int n = sc.nextInt();
        System.out.println("First " +n+ " natural numbers in reverse order ");
        for (int i=n;i>0;i--){
            System.out.println(i);
        }

    }
}
