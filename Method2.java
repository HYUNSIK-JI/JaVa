class Method2Pram{
	public static void main(String[] args){
		double myHeight=175.9;
		hieveryone(12,12.5);//12���ڿ� 12.5�� ����
		hieveryone(13,myHeight);//����13�� myheight�� ����Ȱ� ����
		byeveryone(); //�����ϴ� ���ھ���
	}
	public static void hieveryone(int age,double height){
		System.out.println("�� ���̴� "+age+"���Դϴ�.");
		System.out.println("���� Ű�� "+height+"cm�Դϴ�.");
	}
	
	public static void byeveryone(){
		System.out.println("������ �˰ڽ��ϴ�.");
	}
}