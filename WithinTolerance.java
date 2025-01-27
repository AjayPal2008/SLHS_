/*Tolerance.java
Engineering use lots of measurements, and none of these measurements is a nice clean number. Often
it is measurements within a certain precision. One of the first things you learn in your measurements in
an engineering course is tolerance. This can occur when you are manufacturing millions of items and
need every item to be a certain measurement. It is very difficult to get two items to be exactly the same
measurement, so the engineer is given a tolerance to abide by.
For example, if a piece of metal is to be cut to 4.25 cm with a tolerance of 0.001, that means any piece
of metal between 4.249 cm and 4.251 cm will be acceptable. These tolerance can get pretty small
depending on the engineering being done.
The programmer will write a static method in the Tolerance class called tolerance which will return an
ArrayList of doubles. The method will receive an ArrayList of doubles that stores the measurements of a
mass-produced item. The method will receive a double of the expected measurement and a double of
the tolerance of the measurement. The program will remove the measurements that are within the
tolerance and place it in a new list that will be returned by the method. This new list should be in the
same order as they were in the original list. The original list should only store the measurements that
were out of the tolerance given. They should also be in the same order.
For example, consider the following
Original list: [4.225, 4.221, 4.3, 4.1, 4.2, 4.223, 4.22, 4.623, 4.2999, 4.2200000001]
target measurement: 4.22
tollerance level: 0.005
when the method is called, the following results are made
The original list should be [4.3, 4.1, 4.2, 4.623, 4.2999]
The returned list should be [4.225, 4.221, 4.223, 4.22, 4.2200000001]
Good Luck*/

/////////////////////////////////
import java.util.Scanner;
import java.util.ArrayList;
public class WithinTolerance {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      ArrayList <Integer> D = new ArrayList<Integer>();
    }


    public static void tolerance(ArrayList<Integer> F ,double measurement  , double tolerance){
        ArrayList<Integer> A = new ArrayList<Integer>();
          for(int i = 0 ; i<F.size(); i++){
              if(F.get(i)>measurement-tolerance&&F.get(i)<measurement+tolerance){
              A.add(F.get(i));
              F.remove(F.get(i));
              i--;
              }
          }
        System.out.println(A);
        System.out.println(F);
    }
}