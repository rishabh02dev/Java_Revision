package src;

import java.util.Scanner;

public class Chapter_4_Practice_set {
    public static void main(String[] args) {
        //Problem 1
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

        //Problem 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in first subject");
        float marks1 = sc.nextFloat();
        System.out.println("Enter your marks in second subject");
        float marks2 = sc.nextFloat();
        System.out.println("Enter your marks in third subject");
        float marks3 = sc.nextFloat();

        float percentage;
        percentage = (marks1+marks2+marks3)/300*100;
        System.out.println(percentage);
        if(percentage>40 && marks1>33 && marks2>33 && marks3>33){
            System.out.println("Pass");
        }else{
            System.out.println("sorry better luck next time");
        }
}}