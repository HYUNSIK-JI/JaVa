class ����05_7_1{
	public static void main(String[] args){
		for (int i=2; i<10; i=i+2){
			for(int j=1; j<10; j=j+1){
				System.out.println(i+"x"+j+"="+i*j);
				if(i==j)
					break;
				}
			}
		}
}