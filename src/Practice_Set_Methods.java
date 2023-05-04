package src;

public class Practice_Set_Methods {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n" , n, i, n*i );
        }
    }
    static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j =0; j<i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



    static int sumRec(int n){
        //base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

//    / QUESTION 6.
//    static int average(float ...args){
//        float sum = 0;
//        float average = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum+=args[i];
//
//        }
////        System.out.println(sum);
//        return (int) (average = sum/args.length);
//    }





    public static void main(String[] args) {
        //problem 1
//        multiplication(2);

        //Problem 2
//        pattern1(9);

        //problem 3
//        int c = sumRec(3);
//        System.out.println(c);

        //problem 4
        // fibonacci series
        int result = fib(4);
        System.out.println(result);
    }
}
