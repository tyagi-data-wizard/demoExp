package strvrSheet;

public class revNum {
	
	    public static int reverse(int x) {

	        int res = 0;
	        while(x !=0)
	        {
	            int tmp = x%10;     //4 3 2 1
	            res = res*10+tmp;	//4321
	            x = (x-tmp)/10;		//1234-4/10 123
	            
	            if(res%10!=tmp) //exceed int range
	            {
	                return 0;
	            }
	        }
	        
	        return res;
	    }
	
	public static void main(String[] args) {
		
		System.out.print(reverse(1234));
	}

}
