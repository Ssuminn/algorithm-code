import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();
            int n = 0;
            
            if(L>=X){
            	n = L - X;
            }
            else if(X>U){
                n = -1;
            }
           	System.out.println("#" + test_case + " " + n);
		}
	}
}