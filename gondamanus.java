
import java.util.Scanner;

public class gondamanus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int l = sc.nextInt();
        String cassete=sc.nextLine();
        String [] n = new String[30];
        int p = 0;
        int kung = 0;
        for(int i = 1 ; i<cassete.length()-1;i++){
            if(cassete.charAt(i)==cassete.charAt(i+1)){
                if(cassete.charAt(i-1)!=cassete.charAt(i)){
                    n[kung]= ""+cassete.substring(i-1,i+2);
                    kung++;
                }
                p++;
            }


        }

        System.out.println(kung+1);
        for(int i = 0 ; i<n.length ; i++){
            if(n[i]==null){
                break;
            }
            System.out.println(n[i]);

        }
        sc.close();



    }
}
