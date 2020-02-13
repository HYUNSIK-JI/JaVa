class ¹®Á¦05_7_2{
	public static void main(String[] args){
		for (int i=0; i<10; i++){
			for(int j=0; j<10; j=j+1){
				if(((i*10+j)+(j*10+i))==99)
					{
					System.out.println(i+"+"+j+"="+i+j);
					System.out.println(j+"+"+i+"="+j+i+'\n');
					}
				}
			}
		}
}