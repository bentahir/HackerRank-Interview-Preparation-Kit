package main;

import java.util.*;

class Solution{
    public static  void main(String []argh)
    



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long x [] = new long [t]; 
        String msg [] = new String [t];
        for(int i=0;i<t;i++)
        {

            try
            {
                x[i]=sc.nextLong();

                if(x[i]>=-128 && x[i]<=127){
                    System.out.println(x[i]+" can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else
                    if(x[i]>=-32768 && x[i]<=32767){
                        System.out.println(x[i]+" can be fitted in:");
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                    }
                    else
                        if(x[i]>=-2147483648 && x[i]<=2147483647){
                            System.out.println(x[i]+" can be fitted in:");
                            System.out.println("* int");
                            System.out.println("* long");
                        }
                        else 
                            if(x[i]>=-9223372036854775808L && x[i]<= 9223372036854775807L){
                                System.out.println(x[i]+" can be fitted in:");
                                System.out.println("* long");
                            }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}





