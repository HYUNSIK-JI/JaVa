class OverrideMistake{
	public static void main(String[] args){
		parentAdder adder=new childAdder();
		System.out.println(adder.add(3,4));
	}
}
class parentAdder{
	public int add(int a,int b){
		return a+b;
	}
}
class childAdder extends parentAdder{
	//���� Ŭ������ add�� �������̵� �Ϸ��մϴ�.
		public double add(double a,double b){
			System.out.println("������ �����մϴ�");
			return a+b;
	}
}