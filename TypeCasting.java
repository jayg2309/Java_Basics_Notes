import java.util.Scanner;

// type conversion and casting
public class TypeCasting {
    public static void main(String[] args) {
        // one datatype converts to another if following conditions are met
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat(); // right side of = is the source type
//        System.out.println(num); // first condition 2 types should be compatible
                                 // second-> destination type should be greater than the source type ex here float is greater than integer
//      int num1 = input.nextFloat(); // this gives error [java: incompatible types: possible lossy conversion from float to int]
//        int num = 34.345f; // wrong this will give error
//        int num = (int)(34.345f); // correct way . This is called type casting
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); // gives output as 1 wtf lmao
        // byte has max storage of 256 so when put with 257 it gives us the remainder // 257 % 256 = 1
//        byte a =40;
//        byte b =50;
//        byte c = 100;
//        int d = (a*b)/c; // a*b gives 2000 as byte which exceeds byte storage so java automatically converts the intermediate to int to perform operation
//        System.out.println(d); // op 20
//
//        byte b=50;
//        b = b * 2; // here b gets converted to int automatically and as it becomes an integer it can't be stored in the byte hence ERROR

          // character example
//        int number = 'A'; //op 65
//        System.out.println(number);
        // Rules for promotion
        // all byte short and char values are promoted to integer
        // if any one of the operands is long the whole opeeration will be promoted to long //same with float,double
//        System.out.println(3 * 5.3235436f); // this gives float
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c) - (d * s);
        // op is float + int - double = double (as double is biggest)
        System.out.println((f*b) +" "+ (i / c) +" " + (d * s));
        System.out.println(result);



    }
}