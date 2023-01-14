package strvrSheet;

public class cntDig {
	
	//Complexity = O(n)
	public static void countFun(int n) {
	int temp = n;
	int count = 0;
	while(temp!= 0) {
		temp = temp/10;

		System.out.println("temp = "+temp);
		count++;
	}
	System.out.println(count);
}
	//Complexity = O(1)
	public static void countFunStr(int n ) {
		String str = Integer.toString(n);
		int len = str.length();
		System.out.println(len);
	}
	public static void main(String[] args) {
		countFun(24245);
		countFunStr(24245);
	}
}
