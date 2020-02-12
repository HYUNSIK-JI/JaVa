class BreakBasic{
	public static void main(String[] args){
		int num=1;
		boolean search=false;
		//처음 만나는 5의배수이자 7의배수인수를 찾는 반복문
		while(num<100){
			if(((num%5)==0)&&((num%7)==0)){
				search=true;
				break;//while문 탈출
			}
			num++;
		}
		
		if(search)
			System.out.println("찾는정수:"+num);
		else
			System.out.println("5의배수이자 7의배수인수를 찾지 못했습니다.");
	}
}