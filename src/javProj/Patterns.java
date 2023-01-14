package javProj;
import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		pattern8(n);		

	}

	private static void pattern7(int n) {
		for(int i=1;i<=n;i++) {
			//4space(n-i) 1star i=1 j=5 n=5
			//3space(n-i) 3star i=2 j=6 n=5
			//2space(n-i) 5star i=3 j=7 n=5
			//1space(n-i) 7star i=4 j=8 n=5
			//0space(n-i) 9star i=5 j=9 n=5
			for(int j=1;j<=n+i-1;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.print("\n");
			
		}
		
	}
	
	private static void pattern8(int n) {
		 for(int i=n;i>=1;i--){
	            //0space(n-i) 9star i=5 j=9 n=5
				//1space(n-i) 7star i=4 j=8 n=5
				//2space(n-i) 5star i=3 j=7 n=5
				//3space(n-i) 3star i=2 j=6 n=5
				//4space(n-i) 1star i=1 j=5 n=5
	            for(int j=1;j<=n-1+i;j++){
	                if(j<=n-i){
	                    System.out.print(" ");
	                }else{
	                    System.out.print("*");
	                }
	                
	            }
	            System.out.print("\n");
	        }
	}


}
