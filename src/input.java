import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("THe sum of these numbers is ");
        System.out.println(sum);
        System.out.println("Enter first float number");
        float c = sc.nextFloat();
        System.out.println("Enter second float number");
        float d = sc.nextFloat();

        float sums = c+d;
        System.out.println(sums);

        String str = sc.next();
        System.out.println(str);

        String strs  = sc.nextLine();
        System.out.println(strs);

    }
}
