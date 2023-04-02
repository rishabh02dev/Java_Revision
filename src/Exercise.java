import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks for subject 1");
        float  a = marks.nextFloat();
        System.out.println("Enter the marks for subject 2");
        float b = marks.nextFloat();
        System.out.println("Enter the marks for subject 3");
        float c = marks.nextFloat();
        System.out.println("Enter the marks for subject 4");
        float d = marks.nextFloat();
        System.out.println("Enter the marks for subject 5");
        float e = marks.nextFloat();
        System.out.println("The percentage for your 5 subjects is ");
        float percentage = (a+b+c+d+e)/500*100;
        System.out.println(percentage);





    }
}
