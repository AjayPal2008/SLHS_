/*Galaxy.java
Write a method called getWords that will receive a String. The String is the filename of a textfile
containing a bunch of words. Read each word from the file and place them into an ArrayList of String.
The getWords method returns that ArrayList.
For example, consider a text file called Star Wars.txt as seen below
It is a period of civil war.
The method would return the ArrayList
[It, is, a, period, of, civil, war.]
Good Luck, and may the Force be with you.*/

////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class OpeningScroll {
    public static void main(String[] args) throws IOException {
        OpeningScroll a = new OpeningScroll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the TextFile");
        String h = sc.next();
        ArrayList<String> X = new ArrayList<String>();
        X=a.getWords(h);
        System.out.println(X);
    }
    public ArrayList<String> getWords(String k)throws IOException{
        Scanner sc = new Scanner(new File(k));
        ArrayList<String> P = new ArrayList<String>();
        while(sc.hasNextLine()){
            String h = sc.nextLine();
            P.add(h);
        }
        return P;



    }
}
