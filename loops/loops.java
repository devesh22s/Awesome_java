package loops;

public  class loops {
    public static  void main(String args[]){
//                int n = 5;
//                long factorial = 1;
//                for (long i = 1; i <=5; i++) {
//                   factorial *= i;
//                    System.out.println(i);
//                }

//                System.out.println("Factorial of " + n + " is: " + factorial);


//        -------------------------------------------------------------------
//         printing alphabet in java
//        for (char a = 'A'; a <= 'Z'; a++) {
//            System.out.print(a + " ");
//        }

//        -----------------------------------------------------------------
//         reversing the number

//        int reversed = 0;
//
//        for (int number = 6789; number > 0; number = number / 10) {
//            int lastDigit = number % 10;
//            reversed = reversed * 10 + lastDigit;
//        }
//        System.out.println(reversed);

//        --------------------------------------------------------

//        star pattern
//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        ------------------------------------------------------
//        2nd star
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        ------------------------------------------------------
//         int n = 5;
//         for (int i = 1; i <=n; i++){
//         for(int j = 1; j <= n-i+1; j++){
//
//         System.out.print("*");
//
//         }
//         System.out.println();
//
//         }

//--------------------------------------------------------------
//         int n = 5;
//         char ch = 'a';
//         for (int i = 1; i<= n; i++){
//         for (int j = 1; j<= i; j++){
//         System.out.print(ch);
//         ch++;
//         }
//         System.out.println();
//         }


//         ------------------------------------------------
//        alphabet
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            char ch = 'a';
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

//        ------------------------------------------
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}