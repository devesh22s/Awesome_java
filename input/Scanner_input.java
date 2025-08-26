import java.io.*;
import java.util.*;

public class Scanner_input {
    public static  void main(String [] args) throws IOException {
        File obj = new File("name.txt");
//        obj.createNewFile();
//        InputStream obj2 = new FileInputStream("name.txt");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.skip("devesh");
        String s = sc.nextLine();
        System.out.println(a);


    }


}