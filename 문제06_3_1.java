class ¹®Á¦06_3_1{
	public static void main(String[] args){
		int n=10;
		System.out.println(multiple(n));
	}
	public static int multiple(int n){
		if(n==1)
			return 2;
		else
			return 2*multiple(n-1);
	}
}
	