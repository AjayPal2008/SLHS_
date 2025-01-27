/*ZipCodes.java
You are writing a program for a mass marketing corporation. They have certain items they want
to send around the country based on the zip code. The company will store zip codes in an
ArrayList. An example of the arrayList is:
zipCodes
0 1 2 3 4 5 6
write a method called addZip. addZip will add a zip to the ArrayList zipCodes if and only if that
zip is not already in zipCodes.
For example
addZip call zipCodes added?
addZip(zipCodes, 77777); 77459, 76234, 76859, 77101, 25064, 25000,
19122, 77777
true
addZip(zipCodes,76234); 77459, 76234, 76859, 77101, 25064, 25000,
19122, 77777
false
addZip(zipCodes,62362); 77459, 76234, 76859, 77101, 25064, 25000,
19122, 77777, 62362
true
addZip(zipCodes,77101); 77459, 76234, 76859, 77101, 25064, 25000,
19122, 77777, 62362
false
write a method called removeZip. removeZip will remove all instances of a given zip to the
ArrayList zipCodes .
Write a printList method that prints the entire list.
Create a main method that instantiates an ArrayList of Strings. Read from standard user input.
The first number will be the number of intitial zip codes to add, followed by that exact number
of zipcodes. Then the next number will be the number of zipcodes to add followed by that exact
number of zipcodes. Finally the next number will be the number of zipcodes to remove followed
by that exact number of zipcodes.
Invoke printlist method
Invoke addZip, using input from the user.
Invoke printlist method
Invoke removeZip, using input from the user
Invoke printlist method
Sample File
7
77459
76234
76589
77101
25064
25000
19122
4
77777
76234
62362
77101
4
77777
12345
25000
77459
Sample Output
Initial List
77459 76234 76589 77101 25064 25000 19122
Adding 77777
Adding 76234
Adding 62362
Adding 77101
Current List
77459 76234 76589 77101 25064 25000 19122 77777 62362
Removing 77777
Removing 12345
Removing 25000
Removing 77459
Current List
76234 76589 77101 25064 19122 62362
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ZipCode {
    ArrayList<Integer>zipCodes=new ArrayList<Integer>();
    ArrayList<Integer>Addition = new ArrayList<Integer>();
    ArrayList<Integer>Removal = new ArrayList<Integer>();

    public static void main(String[] args) {
        ZipCode D= new ZipCode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of zip codes");
        int n = sc.nextInt();
        System.out.println("Enter zip codes");
        for(int i = 0 ; i<n ; i++){
            D.zipCodes.add(sc.nextInt());
        }
        System.out.println("Enter no. of zipcodes to add ");
        n = sc.nextInt();
        System.out.println("Enter the Zipcodes now ");
        for(int i = 0 ; i<n ; i++){
            D.Addition.add(sc.nextInt());
        }
        System.out.println("Enter no. of zipcodes to remove ");
        n = sc.nextInt();
        System.out.println("Enter the Zipcodes now ");
        for(int i = 0 ; i<n ; i++){
            D.Removal.add(sc.nextInt());
        }

        System.out.println("Initial List");
        D.printList();
        D.addZip();
        System.out.println("Current List");
        D.printList();
        D.removeZip();
        System.out.println("Current List");
        D.printList();
    }
    public  void printList(){
        for(int i :zipCodes){
            System.out.print(i+" ");
        }
    }

    public void addZip(){
        for(int i = 0 ; i<Addition.size();i++){
            if(zipCodes.indexOf(Addition.get(i))==-1){
                System.out.println("Adding "+Addition.get(i));
                zipCodes.add(Addition.get(i));
            }
        }
    }

    public void  removeZip(){
        for(int i = 0 ; i<Removal.size();i++){
            while(zipCodes.indexOf(Removal.get(i))!=-1){
                System.out.println("Removing " +Addition.get(i));
                zipCodes.remove(Removal.get(i));
            }
        }
    }


}
