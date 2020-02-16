class ¹®Á¦06_3_2{
	public static void main(String[] args){
		int n=100;
		binary(n);
	}
	public static int binary(int n){
		if(n>0){
			int bin=n%2;
			n/=2;
			
			binary(n);
			System.out.print(bin);
			}
		return 0;
	}
}