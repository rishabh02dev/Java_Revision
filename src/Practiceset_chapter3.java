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



    }
}
