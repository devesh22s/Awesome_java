public class Arrayargs {
//    public static void main(String[] args) {
//        System.out.println(args.length);
//        String[] arr = new String[]{"devesh", "rahul"};
//        printArr(arr);
//
//    }
//
    public static void printArr(String... args) {    // parameters
        for(String s: args){
            System.out.println(s);
        }
    }


//    -----------------------------------
    public static void main(String... args) {
        String a = "devesh";
        String b = "vijay";
        printArr(a,b);

    }
}