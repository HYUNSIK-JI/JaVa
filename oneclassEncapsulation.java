class oneclassEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
		suf.takesinus(new sinuscap());
	}
}
class sinuscap{
	void sniTake(){
		System.out.println("�๰�� ��~���ϴ�.");
	}
	void sneTake(){
		System.out.println("��ġ�Ⱑ �ܽ��ϴ�.");
	}
	void snuTake(){
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}

	void take(){
		sniTake();
		sneTake();
		snuTake();
	}
}
class ColdPatient{
	void takesinus(sinuscap cap){
	cap.take();
	}
} 