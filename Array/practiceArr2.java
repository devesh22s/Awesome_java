public class practiceArr2 {
    public static void main(String args[]){
//        find two numbers in an array that sum up to a given target value;
        int []arr = {1,7, 5, 22};
        int target = 12;
        int start =0;
        int end = arr.length -1;

        for(int i =0; i <arr.length; i++){
            for(int j =1; j<arr.length; j++){
                if(arr[i] +arr[j] == target){
                    System.out.println(arr[j] + " " + arr[i]);
                }
            }
        }




    }
}