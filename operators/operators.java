package operators;

import java.util.Scanner;

public class operators {
    // operators.operators -> that performs operation on operands
// uniray operators.operators - perform operation on one operand
// binary operators.operators - perform operation on two operand
// ternary operator

    // 1. Arithmetic operators.operators -> +, - , *, /
    public static void main(String[] args){
//        byte a = 4;
//        byte b = 5;
////        byte c = a +b;  // here the error occurred  because when we use arithmetic operator the value of a and b changed into int, and therefore the storing data type is must be int
//        int c = a +b;
//        System.out.println(c);
//        eg
//        byte  d = 45;
//        long e = 44;
//        long f = e+d;
//        System.out.println(f);

//        System.out.println(10/0);  // infinity , so it will crash
//        System.out.println(10/0.0);
////      in the case of integral value (byte , short , int , long) there is no way to represent infinity that is why arithmetic error was thrown , but in casse of floating value THERE IS constant(infinity)  to represent infinity so no exception is
//        System.out.println(0/0.0);  // provide NaN


//        char a = 'a';
//        char b = 'b';
//
//        System.out.println(a +b);
//
////         String ->
////        when we use + operator and one operand is string, then final result is string.
//        System.out.println(2+3+5 + "ab" + 3+4+5 );















//-
// ----------------------------------------------------------------------------------------
// 2. unary operator -  post and pre increment and decrement -> do not work with values, only work with variable
//         nesting of increment and decrement is not possible
//         final is the keyword in java when used with variable then make them constant
//         we can use in every primitive data type expect boolean



//        final  byte v = 67; // when we update the value of a then it will not be updated because of final
//        char a = 99;
////        char b = ++a; // possible because of post and pre increment
////        char b = 1 + a;  // not possible due to use of arithmetic operator, then it will change in int
//        System.out.println(a);
////              int b = ++(++a); // not possible because first it become 11 then ++11 is not possible
//
//        int b = ++a;
//        System.out.println(a);
//        System.out.println(b);










//-----------------------------------------------------------------------------
// 3. relation operator < > =< >= != ==


//        float f = 10/3;  // fir st when we dividing int value with int then the result will be in int, but we store it in float then it will convert into float
//        double r = 10/3;
//        System.out.println(f + " " + r);
//        System.out.println(f<r);












//-----------------------------------------------------------------------------
//   4. logical operator -> and(&&) (binary ) , or(||)(binary), not (!)(unary)
//         we can apply only these operators.operators to boolean values.
//        System.out.println(true || false);
//        System.out.println(!(3>5));












// ------------------------------------------------------------------------
//        5. Assingment operator ->
//        int a,b,c,d;
//        a= b= c= d= 20;
//        a+=b*=c+=d/=2;
//        System.out.println(a+ " "+ b+ " "+ c+ " "+ d);


















//--------------------------------------------------------------------------------
//        6. bitwise operator -> and(&) or(|) not(~) xor(^)
//         these can be used with boolean and integral datatype also
//        ~(not)  this operator is used with integral value
//        ! operator is used with boolean values
//        same rules that are in logical

        System.out.println(true & false);
        System.out.println(5&3); //they will represented in binary - 0101 & 0011, here answer - 1 because there 1 common in 1st position
        System.out.println(2 & 4); // 0010 & 0100  - here the result will be 0 because both do not have 1 on same position
        System.out.println(7&3);  // 0111 & 0011 --> 11 common on 1st and 2nd position so 2power1 + 2power0 = 3
        System.out.println(7|3);   // 0111 | 0011 = 0111

//        xor -> if both have true true or false false then will be false , true only if both value are different
        System.out.println(true ^ false);
        System.out.println(true ^ true);

        System.out.println(7^3);  // 0111 ^ 0011 = 0100

//     ~not operator --> formula => -(n + 1)
//            working  --> there are 32 bits in integer means 4 bit
//            ~2 --> 0000 0000 0000 0010
//                   1111 1111 1111 1101 --> negative 1's compliment
//                   0000 0000 0000 0011  --> 2'S COMPLIMENT
//                 for 2's compliment ---> when Ms is 1 then there is - sign so --> means 1's compliment number negative h aur negative numbers ko memory me save karne ke liye 2's compliment ka use hota h jisme +1 add hota h

        System.out.println(~2);



//         why there is need of bitwise operator , if we have logical
//        System.out.println((11<10)&((10/0)>10));
        System.out.println((11<10)&&((10/0)>10));
//         when we use && then 2nd operand will be optional  , SO LOGICal operator performance fast kar deta h









//        ----------------------------------------------------------------------
//        7. shift operator -> shift operators.operators are used to shift the bits of a number left or right , effectively multiplying or dividing the number by power of two
//        left shift (<<)  , right shift (>>), unsigned operator (>>>)
//        left shift
//        System.out.println(5<<3); // (a * 2^b)  =>5*2p3 = 40
////        right
//        System.out.println(20>>2); // (a/b^2)
//
//
//
//        int a = 8-2*3/5-4;   // president rule
//        System.out.println(a);
//
//
//        int v = 10;
//        int b = v++ - ++v + ++v + --v;   // 10 - 12 + 13 + 12
//        System.out.println(b);
//        System.out.println(v);




//        unary operator ( operators.operators on one operand)  ! ~
//        binary operator (operators.operators on two operand )   << >> ^

//        flow ->  unary - binary - arithmetic - shift - relational - bitwise - logical - ternary


//        boolean c = v++ - ++v + ++v * --v >=34>>2 && true;



//        System.out.println((v++ - ++v + ++v * --v) >= 34);
//        System.out.println(v++ - ++v + ++v * --v >= 34);



//        -----------------------------------------------
//            common operators use
            int i = (int)Math.random()*100;  // Math.random float me number return karta h
            System.out.println(i);

            if(i<10){
                    System.out.println("you won 10 rs");
            } else if ((i<20) && (i>10)) {
                    System.out.println("you won 20 rs");

            } else if ((i<30) && (i >40)) {
                    System.out.println("won 30 rs");

            } else if ((i <100 && i>50)) {
                    System.out.println("won 100 rs");

            }else {
                    System.out.println("you lose all");
            }



//            eg ->
            int s = 4+3-5/2+3*7%2+12;
            System.out.println(s);





//   -------------------------------------------------------------------------------------------------------
//   8 Ternary operator




    }

}