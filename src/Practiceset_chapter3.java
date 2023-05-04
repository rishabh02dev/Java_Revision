package src;

import java.util.Scanner;

public class Practiceset_chapter3 {
    public static void main(String[] args) {
        //Problem 1
        String name = "Jack Parker";
        name.toLowerCase();
        System.out.println(name);

        //Problem 2

        String text = "To lower Case";
        text = text.replace(" " , "_");
        System.out.println(text);

        //Problem 3

        String letter = "Dear <|Name|>, Thanks a lot!";


        letter =  letter.replace("<|name|>", "Harry");
        System.out.println(letter);

        //Problem 4

        String myString = "This string contains      double     and triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("     "));

        //Problem 5

        String Letter2 = "Dear Harry, \nThis Java Course is Nice. \n\t Thanks!";
        System.out.println(Letter2);



    }
}
