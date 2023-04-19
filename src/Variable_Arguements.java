package src;

public class Variable_Arguements {
//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;

    static int sum(int x, int...arr) {
        //now this x makes it the array having one compulsory
        //arguement
        int result =x;
       // Available as int [] arr;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
//        System.out.println("The sum of 4 and 5 is :" + sum(4, 5);
//        System.out.println("The sum of 3, 4, 5 is" + sum(4,3,5));
    }
}
