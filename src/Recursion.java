package src;

public class Recursion {
   static int factorial(int n) {
       //factorial(n) = n*n-1*....1
       //factorial(5) = 5*4*3*2*1 = 120
       if (n == 0 || n == 1) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
    //this is the iterative approach
   static int factorial_iterartive(int n){
           if(n==0 || n==1){
               return 1;
           }
           else{
               int product =1;
               for (int i=1; i<=n; i++){
                   product = product*i;
               }
               return product;
           }
       }

    public static void main(String[] args) {
         int n =12;
        System.out.println("The value of factorial n is " + factorial(n));
        System.out.println("the value of factorial n by iterative approach is " + factorial_iterartive(n));
    }
}
