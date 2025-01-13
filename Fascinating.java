import java.util.Scanner;
public class Fascinating {
    public static void main(String[] args) {
        int a ,b=0;
        String j= " ";
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a three digit no.");
        a=scanner.nextInt();
        b=a%1000;
        for(int i = 1 ; i<=3;i++){
            j=j+(b*i);

        }

        String n = j.trim();
        int y = 0;
        for(int i = 1;i<=9;i++){
            for(int k = 0; k<n.length();k++){
                if(i==(n.charAt(k)-48)){
                    y++;
                    break;
                }
            }
        }
        if(y==9){
            System.out.println(b +"\t is a fascinating no.");
        }
        else {
            System.out.println(b + "\t is not a fascinating no.");
        }




    }
}
