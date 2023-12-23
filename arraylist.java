import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax for arraylist
        ArrayList<Integer> list = new ArrayList<>(5);    // can't add primitives // we add wrapper classes ex. Integer for int
        //initial capacity is 10 elements, but it grows as needed
        // list.add(67);
        // list.add(56);
        // list.add(34);
        // list.add(57);
        // list.add(34);
        // System.out.println(list);
        // //update element at specific index
        // list.set(3,999);
        // System.out.println(list);
        // //remove
        // list.remove(3); // removes element at index 3

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // we can't write list[i] 
        }
        //other method
        System.out.println(list);

        //how no size feature works?
        // In reality size is actually fixed internally
        //if it fills new list is made with increased size and original list content is copied and the old one is deleted
    }

}
