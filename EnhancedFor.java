class EnhancedFor{
	public static void main(String[] args){
		int[] ar={1,2,3,4,5};
		
		//배열요소 전체출력
		for(int e:ar){
			System.out.print(e+" ");
		}
		
		System.out.println();//단순한 줄바꿈
	
		int sum=0;
		//배열 요소 전체 합출력
		for(int e:ar){
			sum+=e;
		}
		System.out.println("sum:"+sum);
	}
}
		