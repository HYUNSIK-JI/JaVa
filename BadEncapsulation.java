class BadEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
	//�๰ ĸ�� ������ ����
	suf.takeSinivelCap(new SinivelCap());

	//��ä�� ĸ�� ������ ����
	suf.takeSneezeCap(new SneezeCap());

	//�ڸ��� ĸ�� ������ ����
	suf.takeSnuffleCap(new SnuffleCap());
	}
}
class SinivelCap{
	void take(){
		System.out.println("�๰�� ��~���ϴ�.");
	}
}
class SneezeCap{
	void take(){
		System.out.println("��ġ�Ⱑ �ܽ��ϴ�.");
	}
}
class SnuffleCap{
	void take(){
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}
class ColdPatient{
	void takeSinivelCap(SinivelCap cap){
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap){
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap){
		cap.take();
	}
} 