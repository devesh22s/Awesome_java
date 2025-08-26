package input;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;

public class console_input {
//    the console class is another way to handle input , often used command line application. It especially useful for secure password input.
    public static void main(String args[]){
        Console console = System.console();
        if(console!= null){
            String name = console.readLine("Enter your name: ");
            char[] password = console.readPassword("Enter your password");
            System.out.println("Name: "+ name);
            System.out.println(Arrays.toString(password));

        }else {
            System.out.println("console not available");
        }


    }
}