class 문제05_4_3{
	public static void main(String[] args){
		int num=1;
		int total=0;

		while(num<=1000){
			if(num%2==0 && num%7==0){
				total+=num; //14의배수 합
			}
			num++;
		}
		System.out.println("총합:"+total);
	}
}