public class foreach {
    public static void main(String args[]){
//        int [] a= new int[20];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i + 1;
//        }
//
//        for(int val:a){
//            if(val%2 ==0){
//                System.out.println(val);
//            }
//        }


//        -------------------------------------------------
//        insert even number in an array up to 20
//        int[] val = new int[10];
//        int count = 0;
//        int num = 2;
//        while (count < 10) {
//            if (num % 2 == 0) {
//                val[count] = num;
//                count++;
//            }
//            num++;
//        }
//        for (int i = 0; i < val.length; i++) {
//            System.out.println(val[i]);
//        }

//        or

//        int [] a= new int[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = 2*(i + 1);
//        }
//
//        for(int val:a){
//
//                System.out.println(val);
//
//        }


//        ----------------------------------------
//        write a program to print thr sum of all values of the array
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        for(int val:arr){
            sum += val;
        }
        System.out.println("total sum of the values are : "+sum);

    }
}