public class linearSearch {
    public static void main(String [] args){


//         wap to search given element for the array

//        int []arr = {2, 4, 56, 9,6,3,7};
//        int element = 3;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                System.out.println("element found on index: " + i);
//                return ;
//            }
//        }
//        System.out.println("element not found");

//        or
//   ----------------linear search ---------------------------

        int[] arr = {2, 4, 3, 9, 6, 3, 7};
        int element = 3;
        int index = search(arr, element, 0);

        if (index != -1) {
            System.out.println("element found at index: " + index);
        } else {
            System.out.println("element not found");
        }
    }

    static int search(int[] arr, int element, int index) {
        if (index >= arr.length) {

            return -1;
        }
        if (arr[index] == element) {
            return index;
        }
        return search(arr, element, index + 1);

//        --------------------------------------------------------------------



    }
}