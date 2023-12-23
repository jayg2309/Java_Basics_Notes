import java.util.Scanner;

public class TwoDarrays{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
     /* MATRIX
       1 2 3
       4 5 6
       7 8 9 
     */   

    int[][] arr = new int[3][3]; // it is not necessary to write number of columns . Rows are necessary
    //individual size of each array row can vary 
    
    //input
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }
    //output
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) { //we use arr[row].length because there can be any length of column. No fixed size
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
    in.close();
    }
}
