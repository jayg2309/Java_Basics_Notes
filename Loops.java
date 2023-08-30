import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q) print numbers from 1 to 5
        /*
        Syntax of for loops
        for (initialization;condition;increment/decrement){
        // body
        }
         */

//        for (int num=1;num<=5;num++){
//            System.out.println(num);
//        }

        // print 1 to n
//        int n = in.nextInt();
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//        }

        // WHILE LOOP
        /*
        while (condition){
            //body
        }
         */
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }
        // Use while loop when you don't know how many times you have to run the loop

        // DO WHILE
        /*
        do {
            //body
            } while (condition);
         */
        int num=1;
        do {
            System.out.println(num);
            num++;
        } while(num<=5);
        // in do while loop executes atleast once
    }
}
