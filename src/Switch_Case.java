package src;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int age;
        System.out.println("Please Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

//        if(age>56){
//            System.out.println("You have experienced");
//        } else if (age>46) {
//            System.out.println("You are semi-experienced");
//        } else if (age>36) {
//            System.out.println("You are semi-semi experienced");
//        }
//        else {
//            System.out.println("You doesn't have enough experience");
//        }


        //Switch Control Statements

        System.out.println(switch (age) {
            case 18 -> "You are going to become an adult";
            case 23 -> "You are going to join a job";
            case 68 -> "You are going to retired";
            default -> "Enjoy your life, you're already doing great";
        });
        System.out.println("Thanks for using my Java course");

    }
}
