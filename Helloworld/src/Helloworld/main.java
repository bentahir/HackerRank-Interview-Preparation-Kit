package Helloworld;

import java.util.Arrays;
import java.util.*;

public class main {

	static public int solution (int N, String S){
        int [][] seat_occupation = new int [N][10];
        for (int i = 0; i< N ; i++) {
            Arrays.fill(seat_occupation[i],0);
        }

        if (S.contentEquals(""))
        	return 0;
        String [] matrix = S.split(" ");
        int result [] = new int[N];
        Arrays.fill(result,0);
        boolean left = false;
        boolean right = false;
        boolean middle = false;

        for(int j=0; j < matrix.length ;j++){
        	char c = matrix[j].charAt(0);
        	
        	System.out.println("matrix"+j+" :"+matrix[j]);
            int row = Integer.parseInt(String.valueOf(matrix[j].charAt(0)))-1;
            System.out.println("row :"+row);
            int col = 0;
            switch (matrix[j].charAt(1)){
                case 'A':
                    col = 0;
                    break;
                case 'B':
                    col = 1;
                    break;
                case 'C':
                    col = 2;
                    break;
                case 'D':
                    col = 3;
                    break;
                case 'E':
                    col = 4;
                    break;
                case 'F':
                    col = 5;
                    break;
                case 'G':
                    col = 6;
                    break;
                case 'H':
                    col = 7;
                    break;
                case 'J':
                    col = 8;
                    break;
                case 'K':
                    col = 9;
                    break;
                default:
                    break;
            }
            seat_occupation[row][col] = 1;
        }
        for (int k =0; k < seat_occupation.length; k++){
        	result[k] =0;
        	left = false;
        	right = false;
            if ((seat_occupation[k][1] == 0 ) && 
                (seat_occupation[k][2] == 0 ) && 
                (seat_occupation[k][3] == 0 ) && 
                (seat_occupation[k][4] == 0 )){
                    result[k] +=1;
                    left = true;
                }
            if ((seat_occupation[k][5] == 0 ) && 
                (seat_occupation[k][6] == 0 ) && 
                (seat_occupation[k][7] == 0 ) && 
                (seat_occupation[k][8] == 0 )){
                    result[k] +=1;
                    right = true;
                }
            if (!left && !right){
                if ((seat_occupation[k][3] == 0 ) && 
                    (seat_occupation[k][4] == 0 ) && 
                    (seat_occupation[k][5] == 0 ) && 
                    (seat_occupation[k][6] == 0 )){
                        result[k] +=1;
                        middle = true;
                }
                
            }
        }
        int Result = 0;
        for (int i = 0 ; i < N; i++){
            Result += result[i];   
        }
        return (Result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ASSALAMOU ALAYKOUM");
		//int res = solution (2,"1C 1A 2F");
		//System.out.println("result="+res);
		

	        
	        /*
	        
	        Scanner scan = new Scanner(System.in);
	        int i = (Integer.valueOf(scan.nextLine()));
	       
	        Double d = (Double.valueOf(scan.nextLine()));
	       
	        
	        String s = scan.nextLine();

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);    
	        
	        
	        scan.close();*/
        Scanner sc=new Scanner(System.in);
        
        
        String [] s = new String[3];
        int [] x = new int [3];
        for(int i=0;i<3;i++)
        {
            s[i]=sc.next();
            x[i]=sc.nextInt();
            //sc.nextLine();
         
        }
        //Complete this line
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.format("%-15s",s[i]);
            System.out.format("%03d%n",x[i]);   
        }
        System.out.println("================================");

	    sc.close();  
	        
	}

}
