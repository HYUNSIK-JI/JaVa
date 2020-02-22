class OnlyClassNoInstance{
	public static void main(String[] args){
		InstCnt.instNum-=15; //인스턴스 생성없이 instNum에 접근
		System.out.println(InstCnt.instNum);
	}
}
class InstCnt{
	static int instNum=100;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스생성:"+instNum);
	}
}