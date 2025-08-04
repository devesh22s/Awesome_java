public class binarysearch {
    public static void main(String[] args) {
//         array should be in ascending order
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int element = 3;
        int index = binarySearch(arr, element);
        if (index != -1)
            System.out.println("Element found at: " + index);
        else {
            System.out.println("Element not found");
        }
    }

    //    by recursive call
    public static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (arr[mid] > element)
                end = mid - 1;
            else {
                start = mid + 1;

            }
        }
        return -1;
    }


// write a program to merge two array


}