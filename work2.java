//public class work2 {
//    public static  void main(String[] args){
////      1.   What happens when you divide an integer by 0 in Java? What about a floating-point number?
////         when we divide any integer by 0 then the server will crash due to the result is infinity not able to read, but in case of floating value the result will be undefined.
////
////      2. What is the result of 5 / 2 and 5.0 / 2 in Java?
////        5/2 = 2 , and 5.0/2 = 2.5
////
////      3. How does the left shift (<<) and right shift (>>) operators.operators work?
////       left shift
//        System.out.println(5<<3); // (a * 2^b)  =>5*2 = 10*2 = 20*2 = 40
////       right
////        System.out.println(20>>2); // (a/b^2)
////
////       4. What is the purpose of the ~ (bitwise NOT) operator?
////         it is unary operator whose value  -->  -(n + 1)
////
////       5. What happens when we use x *= y + z in Java?
//        int x = 2;
//        int y = 3;
//        int z = 4;
//        x *= y + z;  // x = x * (y + z)
//        System.out.println(x);
//
//
////
////      6. What is the result of byte b = 10;  b += 5; in java?
//        byte b = 10;
//        b += 5; // the data type  will change into int , because of use of arithmetic operator.
//        System.out.println(b);
//
//    }
//}


class second{
    public static void main(String [] args){
//       1.  What will be the output for this -->
                System.out.println(5 + 3 + "Java"); // 8Java

//
//        2.  How does boolean result = true || false && false; evaluate?
        boolean t = true;
        boolean f = false;
        System.out.println( t || f && f);  // and operator will work first.

//
//       3.  What is the order of evaluation in x = a + b * c / d - e;?
//        first b * c then / then + then -
//        int a = 2;
//        int b = 3;
//        int c = 4;
//        int d = 5;
//        int e = 6;
//        int x = a + b * c/d -e;
//        System.out.println(x);

//
//     4.  What will be the output:
//        int a = 1;
//     System.out.println(a++ + ++a);  //  1 + 3
//
//      5.  What will be the output:

//        System.out.println(10/3);  //3
//        System.out.println(10/3.0); //3.3333333333333335

    }

}
