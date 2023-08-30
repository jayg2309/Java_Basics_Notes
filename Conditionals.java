import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Syntax of IF Statement
        if (boolean T or F) {
            // body
        }  else{
            //body
            }
         */
    int salary = 25400;
//    if (salary>10000){
//        salary = salary + 2000;
//    }
//    else {
//        salary = salary + 1000;
//    }
//    System.out.println(salary);

    // Multiple IF ELSE Statements
    if (salary>10000){
        salary+=2000; // salary = salary + 2000
    }
    else if (salary>20000){
        salary+=3000;
    }
    else {
        salary+=1000;
    }
        System.out.println(salary);

    }
}