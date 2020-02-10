class CondOp{
	public static void main(String[] args){
		int num1=50;
		int num2=100;
		int big;
		int diff;
		
		if(num1>num2){
			big=num1;
			System.out.println("贖熱:"+big);
			}
		else{
			big=num2;
			System.out.println("贖熱:"+big);
			}
		if((num1-num2)>(num2-num1)){
			diff=(num1-num2);
			System.out.println("瞰渤高:"+diff);
			}
		else{
			diff=(num2-num1);
			System.out.println("瞰渤高:"+diff);
			}
	}
}