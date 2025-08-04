import java.util.Scanner;

public class while_loop {
    public static  void main(String[] args){
//        int i =0;
//        while(i <5){
//            System.out.println("this loop will run upto 5 times");
//            i++;
//        }

//         do while loop
//        int i =0;
////        there is no need of brackets for only one line of code in that block
//        do{
//            System.out.println(i);
//            i++;
//        }while (i <5);
//            System.out.println("i in while loop " + i);


//        -------------------------------------------------------
//             for loop - when we know the number of iteration
//             while loop - when we don't know the number of iteration
//             do while - first print the value then check the conditions
//        /---------------------------------------------------------------

//        int a = 1;
//
//        do{
//            System.out.println("a in do "+ a);
//            a++;
//
//        }while(a <10);
//
//


//        -----------------------------------------------
        // wap the reverse number -->


            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number to reverse: ");
            int number = sc.nextInt();
            int original = number;


        int reversed = 0;
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            System.out.println("Reversed number: " + reversed);
        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number ");
        } else {
            System.out.println(original + " is NOT a Palindrome Number");
        }
        }


}