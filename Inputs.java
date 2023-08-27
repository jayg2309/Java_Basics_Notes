import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//        System.out.print("Please enter a number:");
          Scanner input = new Scanner(System.in); // word input is the object which will take value from "System.in"
                                                  // then we call the input object with dot and nextInt next or nextLine based on our need for input
//        int rollno= input.nextInt();
//        System.out.println("Your roll no is  "+ rollno);
//        int a = 234_000_000; // does not accept comma so use underscore // compiler ignores the underscores
//        System.out.println(a);
//        String name = input.next(); // name variable will store everything (in this case only 1 word)
//        String name1 = input.nextLine();// more than one word // whole sentence
//        System.out.println(name1);
        float marks = input.nextFloat(); // values are not accurate in float // concept of rounding off
        System.out.println(marks);



    }
}
