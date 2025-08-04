import java.sql.SQLOutput;

public class Multidimension {
    public static void main(String args []){
//        int [][] arr =  new int[5][5];
//        arr[0][0] = 5;
//        arr[0][1] = 6;
//        for(int[] arr2: arr){
//            for(int val: arr2){
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }

//        -----------------------------------
//        array  with different sizes
//        int arr[][], arr2  // so only arr can consider as multidimensional array, arr2 is a variable
//        int [][] arr1, arr2 ;   // both are multidimensional array


//        jagged array - it is multidimensional array with different length.



//        int[][] arr = { {3, 2, 1}, {3, 4, 6, 4} };
//
//        for (int[] arr2 : arr) {
//            for (int val : arr2) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }



//        ------------------------------------------
//        WAP to find the largest element in array
//        int[] arr = {5, 12, 7, 3, 25, 9, 18};
//
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Largest element is: " + max);




//        ------------------------------------------------------------------
//        wap to reverse an array

//        int[] arr = {10, 20, 30, 40, 50};
//
//        System.out.println("Original");
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//        System.out.println();
//        System.out.println("Reversed");
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }


//        or

//        int []arr = {10,20,30,40,50};
//        int [] arr2 = new int[arr.length];
//
//        for(int i =0; i<arr.length; i++){
//            arr2[i] = arr[arr.length -1-i];   // we take -1 because we have i =0
//        }
//        System.out.println(arr2);

//        or

//        int [] arr = {10,20,30,40,50};
//        for(int i = arr.length -1; i >=0; i--){
//            System.out.print(arr[i] + " ");
//        }


//        -----------------------------------------
//        wap to copy the element of one array into another

//        int[] original = {5, 10, 15, 20, 25};
//        int[] copy = new int[original.length];
//
//        for (int i = 0; i < original.length; i++) {
//            copy[i] = original[i];
//        }
//        for (int val : copy) {
//            System.out.print(val + " ");
//        }


//        ----------------------------------------------
//        wap to check if the given array is sorted or not

//          int[] arr = {10, 2, 30, 40, 50};
//          boolean flag = true;
//          for(int i =0; i<arr.length-1; i++){
//              if(arr[i]> arr[i +1]){
//                  flag = false;
//                  break;
//              }
//
//
//          }
//        for(int i =0; i<arr.length; i++) {
//            if (flag == false) {
//                System.out.println("unsorted arr " + arr[i]);
//
//            } else {
//                System.out.println("sorted array " + arr[i]);
//            }
//        }



//        ----------------------------------------------------------
//        wap to find the second largest element

//        int[] arr = {10, 20, 45, 30, 25};
//
//        int max = arr[0];
//        int max2 = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max2 && arr[i] < max) {
//                max2 = arr[i];
//            }
//        }
//
//        if (max2 == max) {
//            System.out.println("no second largest element");
//        } else {
//            System.out.println("second largest element is: " + max2);
//        }




//        ----------------------------------------------------
//        given an array that contains only 1 and 0 return the count of maximum consecutive 1s in the array

//        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
//
//        int maxCount = 0;
//        int currentCount = 0;

//        for (int j : arr) {
//            if (j == 1) {
//                currentCount++;
//                if (currentCount > maxCount) {
//                    maxCount = currentCount;
//                }
//            } else {
//                currentCount = 0;
//            }
//        }


//        System.out.println("so consecutive of 1 is: " + maxCount);



//        --------------------------------------------
//        write  a program to rotate an array K time to the right, k = 3
        int [] arr = {1,2,3,4,5};
        int k = 2;

        for (int j = 0; j < k; j++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

//      or

//        int [] rotate = new int[arr.length];
//        for(int i =0; i <arr.length; i++){
//            rotate[(i +k) % arr.length] = arr[i];
//
//        }
//        for(int i =0; i <arr.length; i++){
//            arr[i] = rotate[i];
//
//        }
//        System.out.println("rotate array is : ");
//        for(int val: arr){
//            System.out.print(val + " ");
//        }








    }
}
