class ClassMethod{
	public static void main(String[] args){
		NumberPrinter.showInt(20); //Ŭ���� �̸��� ���� Ŭ�����޼ҵ� ȣ��
		
		NumberPrinter np=new NumberPrinter();
		np.showDouble(3.15);
		np.setMyNumber(75);
		np.showMyNumber();
	}
}
class NumberPrinter{
	private int myNum=0;
	
	static void  showInt(int n){ //Ŭ���� �޼ҵ�(static �޼ҵ�)
		System.out.println(n);
	}
	static void showDouble(double n){ //Ŭ���� �޼ҵ�
		System.out.println(n);
	}
	void setMyNumber(int n){ //�ν��Ͻ� �޼ҵ�
		myNum=n;
	}
	void showMyNumber(){ //�ν��Ͻ� �޼ҵ�
		showInt(myNum);//Ŭ���� ���ο��� Ŭ���� �޼ҵ� ȣ��
	}
}