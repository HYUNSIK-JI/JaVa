class ����06_1_1{
	public static void main(String[] args){
		int a=16;
		int b=3;
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
	}
	public static void add(int a,int b){
		int c=a+b;
		System.out.println("�������:"+c);
	}
	public static void sub(int a,int b){
		int c=a-b;
		System.out.println("�������:"+c);
	}
	public static void mul(int a,int b){
		int c=a*b;
		System.out.println("�������:"+c);
	}
	public static void div(int a,int b){
		int c=a/b;
		int d=a%b;
		System.out.println("��������� ��:"+c+" ������:"+d);
	}
}