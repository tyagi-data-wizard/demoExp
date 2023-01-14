package javProj;

import java.util.*;


public class CWH_04_Literals{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("hello, enter two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The sum of the two integers above is "+c);*/
		
		//System.out.println("Enter the marks of 5 subjects \n");
		int[] marks = new int[5];
		int temp;
		float sum=0;
		for(int i = 0;i<5; i++) {
			System.out.println("Enter the marks of "+(i+1)+" subject \n");
			temp=sc.nextInt();
			marks[i]=temp;
			sum=sum+temp;
		}
		float percent = (sum/500)*100;
		System.out.println("The sum is "+Math.round(sum));
		System.out.println("The percentage is "+percent+"%");
		
		
	}
	

}