class comEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
		suf.takesinus(new sinuscap());
	}
}
class sinivelcap{
	void take(){
		System.out.println("�๰�� ��~���ϴ�.");
	}
}
class sneezecap{
	void take(){
		System.out.println("��ġ�� �ܽ��ϴ�.");
	}
}
class snufflecap{
	void take(){
		System.out.println("�ڰ� ���ո��ϴ�.");
	}
}
class sinuscap{
	sinivelcap sicap=new sinivelcap();
	sneezecap szcap=new sneezecap();
	snufflecap sfcap=new snufflecap();

	void take(){
		sicap.take(); szcap.take(); sfcap.take();
	}
}
class ColdPatient{
	void takesinus(sinuscap cap){
	cap.take();
	}
} 