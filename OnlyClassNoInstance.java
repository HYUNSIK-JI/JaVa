class OnlyClassNoInstance{
	public static void main(String[] args){
		InstCnt.instNum-=15; //�ν��Ͻ� �������� instNum�� ����
		System.out.println(InstCnt.instNum);
	}
}
class InstCnt{
	static int instNum=100;
	
	InstCnt(){
		instNum++;
		System.out.println("�ν��Ͻ�����:"+instNum);
	}
}