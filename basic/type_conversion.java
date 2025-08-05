package basic;

public class type_conversion{
    public static void main(String[] args){
//        byte a = 10;
//        short b = a;   // implicit type conversion or type casting   -- small into big
//        // byte -> short -> int -> long -> float ->double
//        // char ->int
//        long c = 90;
//        float d = c;
//        System.out.println(d);
//
//        short e = 78;
//        byte f = (byte)e;  // explicit type conversion or type casting   -- big to small
//
//
//        byte g = 127;
//        byte h = (byte)(e+4); // cyclic rotation


//        int a = 45;
//        System.out.println(a++ + ++a);



// -----------------------------------------------------------------------------------------
//        byte b = (byte)130;     // in java byte have 8 bit means value -128 to +127
        //01111101  - 1s compliment
//        01111110 - 2s compliment

        // MSb decide the number is positive or negative
//        System.out.println(b);
//        byte s = (byte)0b11110010;
//        System.out.println(s);
        //-14




        // negative number are stored in the form of 2's compliment in the memory
        //00001110
        // 1's compliment means invert all the bits
        //11110001
        // 2's compliment means add 1 to 1's compliment
        //11110010
        // 2p4 2p3 2p2 2p1 2p0
        // 1 0 0 0 0 ->  2p4*1+0+0+0 = 16


//
//------------------------------------------------------------------------------------------

        double d = (int)3254365476324.54352634534;
        System.out.println(d);
    }
}