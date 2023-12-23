import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {  // we understand that args is also an array of string datatype
        Scanner in = new Scanner(System.in);
        // syntax
        // datatype [] variablename = new datatype[size];
        //store 5 roll no

        // int[] rno1 = new int[5];
        // //or
        // int[] rno2 = {1,2,3,4,5};//directly assign it
        // Array of primitive
        // int[] arr; // declaration //array defined in stack memory
        // arr = new int[5]; //initialization //creating an object in the heap memory 
        
        // // Array objects are in heap 
        // // in Java, heap objects are not continuous
        // // hence, Array may not be continuous. It depends on JVM.
        // // PRIMITIVES -> (something that can not be broken down)
        // // primitives are -> int, char, boolean, float
        // // NON-PRIMITVES -> can be broken down, complex structures
        // // ex strings, arrays, etc

        // //to assign values
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        // //printing
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // //without using for loop

        // System.out.println(Arrays.toString(arr));
        // in.close();

        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));
    in.close();
    }
}
