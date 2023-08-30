import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // Q: find max of these 3 no
        int max = a;
        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("max number is :" + max);
    }
}
