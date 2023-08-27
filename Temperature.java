import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temo in degree celcius: ");
        float c = in.nextFloat();
        float f = (c * 9/5) + 32;
        System.out.println(f);
    }
}
