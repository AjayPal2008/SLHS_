/*SumRows.java
The programmer will write a method called sumRows that will return an ArrayList of integers. The
method will receive a 2D array of integer values. The method will sum up each individual row and put it
into an ArrayList. The first row will be summed up and placed into the first index of the ArrayList. The
second row will be placed into the second index of the ArrayList. And so on.
Example, consider the matrix
 1 2 3
 4 5 6
 7 8 9
The resulting ArrayList would be
[6, 15, 24]*/

import java.util.ArrayList;
import java.util.Scanner;

public class InSummation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two dimensional Array");
        System.out.println("Enter the no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int y = sc.nextInt();
        int [] []arr= new int[r][y];
        for(int i= 0;i<r;i++){
            for(int j = 0 ; j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> King = new ArrayList<Integer>();
        King = sumRows(arr);
        System.out.println(King);
    }
    public static ArrayList<Integer> sumRows(int holder [][]){
        ArrayList<Integer>G = new ArrayList<Integer>();
        int sum = 0;
        for(int[] i : holder){
            for(int j :i){
                sum +=j;
            }

            G.add(sum);

            sum=0;
        }

        return G;
    }
}
