import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // output in Java
        // in the standard output stream print something say 345
        System.out.println(345);
        System.out.println("My name is Jay");
        // input in Java
        Scanner input = new Scanner(System.in); // the variable "input" will read everything // system.in for input from keyboard
        //scanner is a class which allows us to take input
//        System.out.println(input.nextInt()); // for int
//        System.out.println(input.next()); // for one word
        System.out.println(input.nextLine());// for whole sentence
    }
}