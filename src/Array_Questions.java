package src;

public class Array_Questions {
    public static void main(String[] args) {
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i = 0; i < mat1[i].length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" ");
//
//        }

        //write a program to reverse an array

//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp ;
//        for (int i=0 ; i<n; i++){
//            // swap a[i] and a[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element :arr){
//            System.out.print(element + " ");
//        }

        // Pratice Problem 6
        // to find the maximum element in the given array

//        int [] arr = {-1,-1,-2};
//        int max =0;
//        for (int element :arr){
//            if(element>max){
//                max = element;
//            }
//            System.out.println("The given array consists of negative numbers");
//        }
//        System.out.println("The value of maximum element in this array is " + max);


        //Practice Problem seven
        // to find the minimum element in the array

//        int [] arr = new int [] {25, 11, 7, 75, 56};
//        //Initialize min with first element of array.
//        int min = arr[0];
//        //Loop through the array
//        for (int i = 0; i < arr.length; i++) {
//            //Compare elements of array with min
//            if(arr[i] <min)
//                min = arr[i];
//        }
//        System.out.println("Smallest element present in given array: " + min);
//    }


        // Write a java program to find out whether the given element is sorted or not

        Boolean isSorted = true;
        int[] arr = {1, 2100, 3, 455, 5, 34, 67};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }


    }
}

