package src;

import java.util.Scanner;



public class Strings {
    public static void main(String[] args) {
        String name = new String("Rishabh");
        String names = "rishuu";
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f ", a,b);
        //f is format specifier;
        System.out.format("the value of a is %d and value of b is %f" , a , b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
