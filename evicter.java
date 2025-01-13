import java.util.Scanner;

public class evicter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        int k = sc.nextInt();
        String j = sc.next();



        String holder;
        String [] klix = new String[y/3];
        int u = 0;

        sc.close();
        boolean[] arr=new boolean[26];
        for(int i = 1 ; i<y-1;i++){
            holder=j;
            if(j.charAt(i)==j.charAt(i+1)&&j.charAt(i)!=j.charAt(i-1)){
                if(!arr[j.charAt(i-1)-98]){
                    holder=holder.replaceAll(""+j.charAt(i-1)+j.charAt(i)+j.charAt(i+1),"");
                    int l = y-holder.length();
                    if(l/3>=k){
                        klix[u]= ""+j.charAt(i-1)+j.charAt(i)+j.charAt(i+1);
                        u++;
                    }
                    arr[j.charAt(i-1)-98]=true;
                }
            }

            else if(j.charAt(i)==j.charAt(i+1)&&j.charAt(i)==j.charAt(i-1)){

            }


        }

        System.out.println(u);
        for(int i = 0 ; i<u;i++){
            System.out.println(klix[i]);
        }
    }
}
