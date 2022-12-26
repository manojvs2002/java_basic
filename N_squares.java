package arrays;

import java.util.Scanner;

public class N_squares {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("enetr the vaalue of n");
			int n=in.nextInt();
			if(n<=0)
			{
				System.out.println("invalid number entered ");
				
			}
			else
			{
				int sum=0;
			
				while(n!=0)
				{
					
					sum=sum+n*n;
					n--;
					
				}
				System.out.println("number of square matrice formed are"+sum);
			}
		}
	}
	}
