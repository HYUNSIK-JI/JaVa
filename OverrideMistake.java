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
	//상위 클래스의 add를 오버라이딩 하려합니다.
		public double add(double a,double b){
			System.out.println("덧셈을 진행합니다");
			return a+b;
	}
}