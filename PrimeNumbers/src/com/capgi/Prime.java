package com.capgi;

import java.util.Scanner;

public class Prime {
	public static void pNumbers(int n) {
		int count=0;
		
		for(int i=1;i<=n;i++)
			
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					System.out.println(i);
			}
				
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime.pNumbers(n);
		

	}

}
