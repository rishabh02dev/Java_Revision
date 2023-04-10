package src;

public class Arrays {
    public static void main(String[] args) {
        //Classroom of 500 students -- You have to store marks
        //of these 500 students
        // You have 2 options then
        // 1. Create 600 variables
        // 2. Create an Array

//        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 90;
//        marks[3] = 80;
//        marks[4] = 70;

        // 1. Declaration and memory allocation
        // int [] marks = new int[5];
        // 2. Declaration and then memory allocation
        // int [] marks;
        // new int[5];
        //intialization
        // marks[0] = 100;
        //marks[1] = 56;
        //marks[2] = 455;
        //marks[3] = 45;
        //marks[4] = 566;



        //3. Declaration, memory allocation and intialization together
        // int [] marks_scored = {23,45,56,78,89,90};




//        System.out.println(marks[4]);
//
//        int[] rishabh = {23,43,1242,4356,4};
//        System.out.println(rishabh[1]);

        //int [] marks = new int[5];


        //Properties in Array

//        int [] marks = {98, 45, 79, 99, 80};
//        System.out.println(marks[0]);
//        float [] mark = {98.2f, 45.5f, 79.6f, 99.8f, 80.12f};
//        System.out.println(marks.length);
//        System.out.println(mark[3]);
//        String [] students = {"Harry" , "Rohan","Shubham", "lovish" };
//        System.out.println(students.length);

        //Displaying an Array
        int [] marks = {98, 12, 23, 45, 67};
        System.out.println(marks.length);
        //displaying through for loop


        //Printing using for loop
//        for (int i=0; i<marks.length; i++){
//            System.out.print(marks[i]);
//        }
        //Quick Quiz:: Printing the elements of an array in reverse order

        for (int i = marks.length-1; i>=0;i-- ){
            System.out.println(marks[i]);
        }






    }
}
