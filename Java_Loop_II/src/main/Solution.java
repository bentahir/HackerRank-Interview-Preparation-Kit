package main;
import java.util.*;
import java.io.*;

class Solution{

    public static  double serie (int a, int b, int n){
    	double result =0;
        if (n == 1){
            result = (a + (1*b));

            return result;
        }
        else{
            result = (Math.pow(2,n-1) *b) + serie (a,b, n-1);
            return result;
        }
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int [] a = new int[t];
        int [] b = new int[t];
        int [] n = new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            //System.out.println(a[i]);
            b[i] = in.nextInt();
            //System.out.println(b[i]);
            n[i] = in.nextInt();
            //System.out.println(n[i]);

        }
        
        for(int i=0;i<t;i++){
            for(int j = 0; j < n[i]  ; j++){
            	//System.out.print("i="+i+"a[i]="+a[i]);
            	//System.out.print("i="+i+"b[i]="+b[i]);
            	//System.out.print("j="+j);
            	int res = (int) serie (a[i],b[i],j+1);
            	System.out.print(res+" ");
            }
            System.out.println("");
        }

        in.close();
    }
}

