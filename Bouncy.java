// THis is a new program
import java.util.Scanner;
public class Bouncy {
    public static void main(String[] args) {
        int a,descend=0,ascend=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a no.");
        a= scanner.nextInt();
        if (a<100){
            System.out.println("sorry input has to be larger than 100");
            System.exit(0);
        }
        String n = Integer.toString(a);
        for(int i = 0; i<n.length()-1;i++){
            if(n.charAt(i)<n.charAt(i+1)){
                ascend++;
            }
            if(n.charAt(i)>n.charAt(i+1)){
                descend++;
            }
        }
        int u = n.length()-1;
        if(u==ascend||u==descend){
            System.out.println("\n \n \n \n "+a +"\t is not a bouncy no.");
        }
        else {
            System.out.println("\n \n \n \n "+a +"\t is  a bouncy no.");
        }
    }
}
