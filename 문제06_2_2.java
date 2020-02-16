class ¹®Á¦06_2_2{
	public static void main(String[] args){
		for(int i=1; i<100; i++){
			Number(i);
		}
	}
	public static void Number(int i){
		double tmp=Math.sqrt(i);
		int M=(int)tmp;
		for(int j=2; j<=M; j++){
			int R=(i%j);
			if(R==0)
				break;
			if(j==M){
				System.out.println(i);
					}
			}
		
		}
}