//public class basic {
//
//    public static int count = 0;
//    public static void main(String args[]){
////        at any point of time, what are the maximum number of calls that will exist in stack
//        System.out.println("hello");
//        run();
////        run();
//        System.out.println("gii");
//    }
//
////     to prevent stack overflow error we use  base conditions
//    public static void run(){
//        count++;
//        System.out.println("hh");
//        if (count<10)
//            run();  // show stack overflow error
//    }
//}

//------------------------------------------------- logic of stacks ----------------------------------------

//Stack → LIFO → Last in, first out
//Queue → FIFO → First in, first out



//Stack:        (Bottom → Top)
//
//        [1]   ← pehle gaya
//        [2]
//        [3]   ← last mein gaya
//
//Pop() → 3 niklega pehle
//Pop() → 2
//Pop() → 1



//------------------------------------------------------------------------------------------

//we can't access instance variable in static method


public  class basic {
    static int i =0;
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        i++;
        if(i <10){
            print();
        }
        System.out.println("hlo");


    }
}