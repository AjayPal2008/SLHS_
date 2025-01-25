/*MultiplesArrayList.java
If we list all the natural numbers below 10 that are multiples of 3 , we get 3, 6 and 9. The sum of these
multiples is 18.
Write a method named multiples that takes an integer representing multiple value and another
representing the limiting value of all natural numbers to inspect. Fill an ArrayList with these values and
return the ArrayList.
Write a test program that will read in a value and a limiting value, invoke multiple method, and prints
the returned list AND it’s sum of all elements*/

//////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.ArrayList;
public class MALstrom {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter multiple value");
        int y = sc.nextInt();
        System.out.println("Enter limiting value");
        int k = sc.nextInt();
        MALstrom a = new MALstrom();
        ArrayList <Integer> h = new ArrayList<Integer>();
        h = a.multiples(y,k);
        System.out.println(h);
        int sum = 0;
        for(int i = 0 ; i<h.size();i++){
            sum += h.get(i);
        }
        System.out.println(sum);

    }

    public ArrayList<Integer> multiples(int multiples , int limit ){
        int holder=multiples;
        // a+(n-1)d = a^n
        while(true){
            if(limit%multiples==0){
                break;
            }
            else{
                limit--;
            }
        }
        limit-=multiples;
        limit/=multiples;
        limit++;
        int num = limit;
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i = 1 ; i<=num ; i++){
            A.add(i*multiples);
        }
        return(A);

    }
}
