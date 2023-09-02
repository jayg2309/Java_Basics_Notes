import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
/*        if (fruit.equals("mango")){      // for strings use object.equals(the_value) instead of object == "the_value"
            System.out.println("king of fruits");             // .equals only checks the value
        }
        if (fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }
*/
//    switch(fruit) {
//        case "Mango":
//            System.out.println("King of fruits");
//            break;
//        case "Apple":
//            System.out.println("a sweet red fruit");
//            break;
//        case "Orange":
//            System.out.println("Round fruit");
//            break;
//        case "Grapes":
//            System.out.println("Small fruit");
//            break;
//        default:
//            System.out.println("please enter a valid fruit"); // no break needed since default is the last case
//    }
//        switch (fruit) {                                      // ENHANCED SWITCHED CASE
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }
        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
//        example of weekday and weekend
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }



}

