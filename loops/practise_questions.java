public class practise_questions {
    public  static  void main(String args[]){
//         half diamond ->

//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j =1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j =1; j <= ((2*i) - 1); j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



//        -------------------------------------------------------
//         half butterfly
//        int n =5;
//         for(int i =1; i <= n; i++) {
//
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i =n-1; i>=1; i--){
//             for(int j = 1; j <=i; j++){
//                 System.out.print("*");
//
//             }
//             System.out.println();
//         }

//        -----------------------------------------------------------
//        0-1 triangle
//        int n =5;
//        for(int i =1; i <= n; i++){
//            for(int j =1; j <=i; j++){
//                if((i+j) % 2 == 0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//
//                }
//
//            }
//            System.out.println();
//        }



//        -------------------------------------------
//        arrow triangle , filled
//        int n = 3;
//        for(int i = 1; i <= n; i++){
//            for(int j =1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j =1; j <= ((2*i) - 1); j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }



//-----------------------------------------------------------------
//        arrow paramymid
//                int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j =1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//
////            for(int j =1; j <= ((2*i) - 1); j++){
////                System.out.print("*");
//
////           left hand number triangle
//            for(int j = 1; j<=i; j++){
//                System.out.print(j);
//
//
//            }
//
//            System.out.println();
//        }

//
//------------------------------------------------------
//      Upward Arrow Pattern
//        int n = 9;
//        int x = n / 2 + 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j == n / 2 + 1 || j == x || j == n - x + 1)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//            x++;
//        }






//-------------------------------------------------------------------
//  symmetric pattern
//        int n = 4;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//            if (i != n) {
//                int spaces = 2 * (n - i);
//                for (int s = 1; s <= spaces; s++) {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }


// --------------------------------------
//        right hand number triangle

//        int n = 5;
//        int num = 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }




//----------------------------------------------------------
//        alphabet triangle
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }



// ------------------------------------------------------
//        alphabet pyramid
//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            for (int s = 0; s < n - i - 1; s++) {
//                System.out.print(" ");
//            }
//
//            char ch = 'A';
//            for (int j = 0; j <= i; j++) {
//                System.out.print(ch++);
//            }
//
//            ch -= 2;
//            for (int j = 0; j < i; j++) {
//                System.out.print(ch--);
//            }
//
//            System.out.println();
//        }

//------------------------------------------------------------------------------

    }
}