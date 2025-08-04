package basic;

public class test_1{
    public static void main(String args[]){
//        1. What is the result of
//        a/b^2
        System.out.println(15 >> 2);
//        2. What will be the output of
        System.out.println(5 | 2);  // 0101 | 0010 = 0111 =>7
//        3. Which of the following is a narrowing conversion in Java?
//a) long to int  // because from big memory size data can't be stored into small  memory size
//        4. What is the output of
        System.out.println(~5);
//        5.What will be the output of
        System.out.println(8 ^ 4);  //xor operator  1000 ^ 0100 = 1100 = 12
//        6. What is the output of
        System.out.println((3 + 4) * 2);
//        7.What does it return?
        System.out.println(2 >>> 1);
        System.out.println(3 * 2 / 4);
        System.out.println((10 % 4) + (6 / 2));



// 1. Write a Java program to demonstrate implicit and explicit type conversion using
//various data types.

        System.out.println("=== Implicit Type Conversion (Widening) ===");

        int intVal = 100;
        long longVal = intVal;  // int to long
        float floatVal = longVal;  // long to float
        double doubleVal = floatVal;  // float to double
        char charVal = 'A';
        int charToInt = charVal;  // char to int

        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);
        System.out.println("char to int: " + charToInt);

        // ===== Explicit Type Conversion (Narrowing) =====
        System.out.println("\n=== Explicit Type Conversion (Narrowing) ===");

        double d = 123.456;
        float f = (float) d;  // double to float
        long l = (long) f;  // float to long
        int i = (int) l;  // long to int
        char c = (char) i;  // int to char



//      2. Write a Java program to show how bitwise AND and OR operators.operators work with integer values.
//        3. Write a Java program to demonstrate the effect of left shift and right shift operators.operators
//on an integer
//        4. Write a Java program to evaluate arithmetic expressions using hardcoded values
//and print the results

//        2,3,4 answers are upperside.

//        5. Write a Java program to demonstrate operator precedence by evaluating a complex
//mathematical expression.
//        int result = a + b * c - d / c + (a - b) * d;


//      6.  What is the highest precedence operator in Java?
//a) * (Multiplication)
//b) + (Addition)
//c) () (Parentheses)
//d) = (Assignment)


//        --->>
//        Precedence Order (Simplified):
//() — Parentheses
//
//++, --, !, ~ — Unary operators.operators
//
//*, /, % — Multiplicative
//
//+, - — Additive


    }
}