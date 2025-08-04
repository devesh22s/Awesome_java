import java.lang.reflect.Array;

public class practiceArr1 {
    public static void main(String args[]){
        int[] arr = {1,0,3,0,0,5,0};
        int index =0;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] !=0){
                arr[index]= arr[i];
                index++;

            }
        }
        for(int j = index; j <arr.length; j++){
            arr[j] = 0;
        }
//        System.out.println(Array.toString(arr));
    }
}