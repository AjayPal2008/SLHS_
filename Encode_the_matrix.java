import java.util.Scanner;
public class Encode_the_matrix {


        String h = "";
        int num = 0 ;
        public    void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter phrases");
            String k ;
            while(sc.hasNextLine()){
                k = sc.nextLine();
                h= h+k+"$";
            }
        }
        public  void parser1000(){
            for(int i = 0 ; i<h.length(); i++){
                if(h.charAt(i)=='$'){
                    num++;
                }
            }
        }
        public static void main(String []args){
            Encode_the_matrix obj = new Encode_the_matrix();
            obj.input();
            obj.parser1000();

            String Holder[] = new String [obj.num];
            int y = 0;
            for(int i = 0 ; i<obj.num ; i++){
                Holder [i]= obj.h.substring(y,obj.h.indexOf(y,'$'));
                y=obj.h.indexOf(y,'$')+1;
            }
            double len = 0.0;
            int root = 0 ;
            for(int i = 0 ; i<obj.num ; i++){
                len =   Holder [i].length();
                if(Math.sqrt(len)!= Math.round(Math.sqrt(len))){
                    root = (int)(Math.sqrt(len)+1);
                    char mat[] [] = new char[root-1][root];
                    int w = 0;
                    for(int m = 0 ; m<mat.length ;m++){
                        for(int n = 0 ; n<mat[0].length ; n++){
                            mat[m][n]= Holder[i].charAt(w);
                            w++;
                        }
                    }
                    String jinx = "";
                    for(int u = 0; u<mat[0].length ; u++){
                        for(int m = 0 ; m<mat.length ;m++){
                            jinx = jinx + mat[m][u];
                        }

                    }
                    System.out.println(Holder[i]+" ==> "+ jinx);
                    jinx="";

                }
                else{
                    root = (int)(Math.sqrt(len));
                    char mat[] [] = new char[root][root];
                    int w = 0;
                    for(int m = 0 ; m<mat.length ;m++){
                        for(int n = 0 ; n<mat[0].length ; n++){
                            mat[m][n]= Holder[i].charAt(w);
                            w++;
                        }
                    }
                    String jinx = "";
                    for(int u = 0; u<mat[0].length ; u++){
                        for(int m = 0 ; m<mat.length ;m++){
                            jinx = jinx + mat[m][u];
                        }

                    }
                    System.out.println(Holder[i]+" ==> " +jinx);
                    jinx="";

                }
            }


        }
    }

