class MyFriends{
	public static void main(String[] args){
		//���� ��â�� ������ ���� �迭 �� ����
		UnivFriend[] ufrns=new UnivFriend[5];
		int ucnt=0;

		//���� ������ ������ ���� �迭�� ����
		CompFriend[] cfrns=new CompFriend[5];
		int ccnt=0;

		//���� ��â�� ���� ����
		ufrns[ucnt++]=new UnivFriend("LEE","Computer","010-333-555");
		ufrns[ucnt++]=new UnivFriend("SEO","Electronics","010-222-4444");

		//���� ������ ���� ����
		cfrns[ccnt++]=new CompFriend("YOON","R&D 1","02-123-999");
		cfrns[ccnt++]=new CompFriend("PARK","R&D 2","02-321-777");

		//��� ��â �� ������ ���� ��ü ���
		for(int i=0; i<ucnt; i++){
			ufrns[i].showInfo();
			System.out.println();
		}
		for(int i=0; i<ccnt; i++){
			cfrns[i].showInfo();
			System.out.println();
		}
	}
}
class UnivFriend{ //���е�â
	private String name;
	private String major; //����
	private String Phone;

	public UnivFriend(String na,String ma,String ph){
		name=na;
		major=ma;
		Phone=ph;
	}
	public void showInfo(){
		System.out.println("�̸�: "+name);
		System.out.println("����: "+major);
		System.out.println("��ȭ: "+Phone);
	}
}
class CompFriend{ // ���� ����
	private String name;
	private String department; //�μ�
	private String Phone;

	public CompFriend(String na,String de,String ph){
		name=na;
		department=de;
		Phone=ph;
	}
	public void showInfo(){
		System.out.println("�̸�: "+name);
		System.out.println("�μ�: "+department);
		System.out.println("��ȭ: "+Phone);
	}
}