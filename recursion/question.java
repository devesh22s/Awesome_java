import java.util.Scanner;

public class question {


//   Recursion ek aisi technique hai jisme ek function khud ko hi call karta hai.

//    public static  void main(String args[]){
////        printnum(1);
//        printnum2(1);
//    }


//    public static void printnum(int n) {
//        if (n <=10) {
//            System.out.println(n);
//            printnum(n + 1);
//        }
//    }


//    -------------------------------------------
//    for  reverse number without value change
//    public static void printnum2(int n) {
//        if (n <= 10) {
//            printnum2(n + 1);     // 📤 recursive call
//            System.out.println(n);   // Function returns back and starts printing, after n = 11, Now the call stack starts unwinding (LIFO):
//
//        }
//    }

//
//  ----------------------------  🔄 Step-by-Step Explanation: ---------------------------------------
//👣 Step 1: Function calls go deeper with n+1
//Let’s track what’s happening:
//
//Call Stack (Going IN)	n Value
//printnum2(1)	1
//→ calls printnum2(2)	2
//→ calls printnum2(3)	3
//...	...
//→ calls printnum2(10)	10
//→ calls printnum2(11)	11 (base case hit, stops)
//
//📌 Until n == 10, it keeps calling forward and goes deep into the stack.
//
//🔙 Step 2: Function returns back and starts printing
//Now the call stack starts unwinding (LIFO):
//
//Returning Call	System.out.println(n)
//From printnum2(11)	nothing (doesn't print)
//Back to printnum2(10)	prints 10 ✅
//Back to printnum2(9)	prints 9 ✅
//Back to printnum2(8)	prints 8 ✅
//...	...
//Back to printnum2(1)	prints 1 ✅


//    -------------------------------------------------------------------------------------------------------
//Print sum of First N numbers using recursion


}

