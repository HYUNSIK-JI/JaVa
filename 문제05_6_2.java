class 문제05_6_2{
	public static void main(String[] args){
		int num=1;
		int total=0;

		while(true){
			if((num%2)!=0){
				total+=num;
				if(total>1000){
					System.out.println(num);//이 숫자를 합하면 천을 넘긴다.
					System.out.println(total);//천이 넘는 합이 몇인지 알려주는것이다.
					break;
				}
			}
			num++;
		}
	}
}