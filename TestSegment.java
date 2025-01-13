import java.util.Scanner;
public class TestSegment {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int k=0;
        int y =(int )N;
        double h = N;
            while(h>1){
                if(h%10>=5 && Math.pow(10,k+1)<10*y)
                {
                    N+=Math.pow(10,k+1);
                }
                h=h/10;
                k++;
            }
            long L = Math.round(h);
            L*=Math.pow(10,k);
            System.out.println(L);

            N/=Math.pow(10,k);
            if(N>1){
                N-=1;
            }

            double j = Math.round(N)*Math.pow(10,k);
            System.out.println(j);


    }
}
